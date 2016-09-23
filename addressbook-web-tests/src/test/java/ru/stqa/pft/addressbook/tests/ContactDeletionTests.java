package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by Oleg.Filatov on 03.08.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToHomePage();
        if ( ! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Name", "Middle Name", "Last name", "Best company", "Moskow","some group"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContactCheckBox(before.size() - 1);
        app.getContactHelper().clickToDeleteButton();
        app.getContactHelper().acceptContactDeletionAllert();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(after, before);
    }
}
