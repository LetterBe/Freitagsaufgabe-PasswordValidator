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
        } else if (hasNumbers(passwordToCheck)) {
            return "Password should have numbers";
        } else {
            return "Password is ok!";
        }
    }

    private static boolean hasNumbers(String passwordToCheck) {
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isDigit(passwordToCheck.charAt(i))) {
                return true;

            }
        }
        return false;
    }

    private static boolean hasUppercase(String passwordToCheck) {
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isUpperCase(passwordToCheck.charAt(i))) {
                return true;

            }
        }
        return false;
    }

        private static boolean hasLowercase (String passwordToCheck){
            for (int i = 0; i < passwordToCheck.length(); i++) {
                if (Character.isLowerCase(passwordToCheck.charAt(i))) {
                    return true;
                }
            }
            return false;
        }
    }