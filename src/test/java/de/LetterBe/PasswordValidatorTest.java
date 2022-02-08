package de.LetterBe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
 * to Do
 * -mindestlänge muss erreicht sein (8) DONE !
 *Zahlen müssen enthalten sein
 *Muss Groß und Kleinbustaben enthalten
 *Möglichkeit mehrere Passwörter zu validieren
 */

class PasswordValidatorTest {

    @Test
    void shouldBeOkWiTh8Symbols() {
        //given
        String testPassword = "skJAj8aH";

        //when
        String actual = PasswordValidator.validatePassword(testPassword);
        //then
        assertEquals("Password is ok!", actual);
    }

    @Test
    void shouldBeOBadWiThLessThen8S() {
        //given
        String testPassword = "skJAj8a";

        //when
        String actual = PasswordValidator.validatePassword(testPassword);
        //then
        assertEquals("Password has less then 8 symbols!", actual);

    }

    @Test
    void shouldBeBadWiThoutDigits() {
        //given
        String testPassword = "skJAj8aH";

        //when
        String actual = PasswordValidator.validatePassword(testPassword);
        //then
        assertEquals("Password should have numbers", actual);
    }

    @Test
    void shouldBeBadOnlyLowercase() {
        //given
        String testPassword = "hfsjdfsh8";

        //when
        String actual = PasswordValidator.validatePassword(testPassword);
        //then
        assertEquals("Password should have capitals Letters", actual);
    }


    @Test
    void shouldBeBadOnlyUppercase() {
        //given
        String testPassword = "HAJSKFJD8";

        //when
        String actual = PasswordValidator.validatePassword(testPassword);
        //then
        assertEquals("Password should have  Letters", actual);
    }
}



