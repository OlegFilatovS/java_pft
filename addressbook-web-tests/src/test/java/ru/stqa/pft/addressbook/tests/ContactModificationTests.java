package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Oleg.Filatov on 03.08.2016.
 */
public class ContactModificationTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToHomePage();
        if ( ! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("SomeName", "LastName", "8921887733", null, "some address", "some group"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contactMod = before.get(before.size() - 1);
        app.getContactHelper().contactModification(contactMod);
        ContactData contact =
                new ContactData("SomeName", "LastName", "8921887733", null, "some address", "some group");
        app.getContactHelper().clickToUpdateButton();
        app.getContactHelper().initNewUser(contact,false);
        app.getContactHelper().submitNewContact();
        app.getContactHelper().returnToHomePage();

        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size(), after.size());


        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
