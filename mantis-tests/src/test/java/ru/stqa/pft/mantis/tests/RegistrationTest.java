package ru.stqa.pft.mantis.tests;

import org.testng.annotations.Test;

/**
 * Created by user on 21.09.2016.
 */
public class RegistrationTest extends TestBase {

    @Test
    public void testRegistration() {
        app.registration().start("user1", "user1@localhost.localdomain");
    }
}

