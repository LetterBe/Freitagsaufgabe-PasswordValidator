package de.LetterBe;

public class PasswordValidator {

    /*
     * to Do
     * -mindestlänge muss erreicht sein DONE!
     *Zahlen müssen enthalten sein
     *Muss Groß und Kleinbustaben enthalten
     *Möglichkeit mehrere Passwörter zu validieren
     */

    public static String validatePassword(String passwordToCheck) {
        if (passwordToCheck.length() < 8) {
            return "Password has less then 8 symbols!";
        }
        return "Password is ok!";
    }

}
