package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by Oleg.Filatov on 02.08.2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
       click(By.linkText("home page"));
    }

    public void initUserInput() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initNewUser(ContactData contactData, boolean creation) {
        click(By.name("firstname"));
        type(By.name("firstname"),contactData.getName());
        click(By.name("middlename"));
        type(By.name("middlename"),contactData.getMiddleName());
        click(By.name("lastname"));
        type(By.name("lastname"),contactData.getLastName());
        click(By.name("company"));
        type(By.name("company"),contactData.getCompany());
        click(By.name("address"));
        type(By.name("address"),contactData.getAdrress());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(ifElementPresent(By.name("new_group")));
        }
    }

    public void addingNewUser() {

        click(By.linkText("add new"));
    }

    public void selectContactCheckBox() {

        setElementSelected(By.id("4"));

    }
    public void clickToDeleteButton() {
        click((By.xpath("//div[@id='content']/form[2]/div[2]/input")));
    }

    public void clickToEditButton() {

        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));

    }

    public void acceptContactDeletionAllert () {

        acceptAlert();
    }

    public void clickToUpdateButton() {

        click(By.name("update"));
    }
}
