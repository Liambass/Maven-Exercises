//Using the following test class, write the code needed to fulfill each test class so that it passes.
//The method should check that the String value passed to it is a valid email address.

package com.qa.testdrivendevelopment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailTest {

    private Email email;

    @Before
    public void setUp() {
        email = new Email();
    }

    @Test
    public void testIsValidEmailGreenPath() {
        boolean actual = email.isValidEmail("firstName.surname@qa.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailGreenPathDifferentDomainName() {
        boolean actual = email.isValidEmail("firstNameSurname@gmail.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailRedPathDomainTooLong() {
        boolean actual = email.isValidEmail("firstName.surname@qa.helloWorld");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoAddress() {
        boolean actual = email.isValidEmail("@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoDomainName() {
        boolean actual = email.isValidEmail("firstName.surname@com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtBeginning() {
        boolean actual = email.isValidEmail("_firstName.surname@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtEnd() {
        boolean actual = email.isValidEmail("firstName.surname@qa.com)");
        assertFalse(actual);
    }
}