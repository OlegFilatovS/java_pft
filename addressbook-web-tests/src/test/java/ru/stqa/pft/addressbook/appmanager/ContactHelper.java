package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg.Filatov on 02.08.2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void submitNewContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void returnToHomePage() {
       click(By.linkText("home page"));
    }

    public void initUserInput() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initNewUser(ContactData contactData,boolean creation) {
        click(By.name("firstname"));
        type(By.name("firstname"),contactData.getName());
        click(By.name("lastname"));
        type(By.name("lastname"),contactData.getLastName());
        click(By.name("Mobile"));
        type(By.name("Mobile"),contactData.getPhone());
        click(By.name("email"));
        type(By.name("email"),contactData.getMail());
        click(By.name("address"));
        type(By.name("address"),contactData.getAddress());


        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void addingNewUser() {

        click(By.linkText("add new"));
    }

    public void selectContactCheckBox(int index) {

        wd.findElements(By.name("selected[]")).get(index).click();

    }
    public void clickToDeleteButton() {
        click((By.xpath("//div[@id='content']/form[2]/div[2]/input")));
    }

    public void contactModification(ContactData contactToModify) {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                && isElementPresent(By.name("update"))) {
            return;
        }
        click(By.cssSelector("a[href=\"edit.php?id=" + contactToModify.getId() + "\"]"));
    }

    public void acceptContactDeletionAllert () {

        acceptAlert();
    }

    public void clickToUpdateButton() {

        click(By.name("update"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contactData) {
        initNewUser(contactData,true);
        initUserInput();
        returnToHomePage();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements) {
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
            String firstName = element.findElement(By.xpath(".//td[3]")).getText();
            String lastName = element.findElement(By.xpath(".//td[2]")).getText();
            String address = element.findElement(By.xpath(".//td[4]")).getText();
            ContactData contact = new ContactData(id, firstName, lastName, "8921887733", null, address, "some group");
            contacts.add(contact);
        }
        return contacts;
    }

}
