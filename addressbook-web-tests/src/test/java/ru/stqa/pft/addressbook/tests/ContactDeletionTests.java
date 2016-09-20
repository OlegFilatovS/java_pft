package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Oleg.Filatov on 03.08.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        if ( ! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Name", "Middle Name", "Last name", "Best company", "Moskow","some group"), true);
        }
        app.getContactHelper().selectContactCheckBox();
        app.getContactHelper().clickToDeleteButton();
        app.getContactHelper().acceptContactDeletionAllert();
    }
}
