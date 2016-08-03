package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Oleg.Filatov on 03.08.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getContactHelper().selectContactCheckBox();
        app.getContactHelper().clickToDeleteButton();
        app.getContactHelper().acceptContactDeletionAllert();
    }
}
