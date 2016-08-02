package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().addingNewUser();
        app.getContactHelper().initNewUser(new ContactData("Name", "Middle Name", "Last name", "Best company", "Moskow"));
        app.getContactHelper().initUserInput();
        app.getContactHelper().returnToHomePage();
    }


}
