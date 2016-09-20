package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Oleg.Filatov on 03.08.2016.
 */
public class ContactModificationTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getContactHelper().clickToEditButton();
        app.getContactHelper().clickToDeleteButton();
        app.getContactHelper().initNewUser(new ContactData("Name2", "Middle Name2", "Last name2", "Best company2", "SaintP","some group"),false);
        app.getContactHelper().clickToUpdateButton();
        app.getContactHelper().returnToHomePage();
    }
}
