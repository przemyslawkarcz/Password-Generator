package PasswordGenerator;

public class PasswordStrength {

    static String password = new Password().createsPassword();

    int counterOfDigits = 0;
    int counterOfCapitalLetters = 0;
    int counterOfSpecialSigns = 0;

    //the method counts all characters of the generated password
    public Integer checksNumberOfCharacters(){

        System.out.println("Password length: " + password.length() + " character/s.");

        return password.length();

    }

    //the method counts all digits of the generated password
    public Integer checksNumberOfDigits(){

        String [] digits = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        char[] passwordAsCharArray = password.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            String cipher = digits[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (cipher.equals(symbol)) {
                    counterOfDigits++;
                }

            }

        }

        System.out.println("The password has " + counterOfDigits + " digit/s.");

        return counterOfDigits;

    }

    //the method counts all capital letters of the generated password
    public Integer checksNumberOfCapitalLetters(){

        String [] capitalLetters = new String[]{
                "A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G",
                "H", "I", "J", "K", "L", "Ł", "M", "N", "Ń", "O",
                "Ó", "P", "Q", "R", "S", "Ś", "T", "U", "V", "W",
                "X", "Y", "Z", "Ź", "Ż"
        };

        char[] passwordAsCharArray = password.toCharArray();

        for (int i = 0; i < capitalLetters.length; i++) {

            String capitalLetter = capitalLetters[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (capitalLetter.equals(symbol)) {
                    counterOfCapitalLetters++;
                }

            }

        }

        System.out.println("The password has " + counterOfCapitalLetters + " capital letter/s.");

        return counterOfCapitalLetters;

    }

    //the method counts all special symbols of the generated password like e.g. # or @ etc.
    public Integer checksNumberOfSpecialSigns(){

        String [] specialSigns = new String[]{
                "~", "`", "!", "@", "#", "$", "%", "^", "&", "*",
                "(", ")", "_", "-", "=", "+", "[", "]", "{", "}",
                "|", "/", ";", ":", "'", "<", ">", ",", ".", "?"
        };

        char[] passwordAsCharArray = password.toCharArray();

        for (int i = 0; i < specialSigns.length; i++) {

            String specialSign = specialSigns[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (specialSign.equals(symbol)) {

                    counterOfSpecialSigns++;

                }

            }

        }

        System.out.println("The password has " + counterOfSpecialSigns + " special sign/s.");

        return counterOfSpecialSigns;

    }

    //the method checks the password strength by comparing the password parameters with the requirements set by the developer
    public void checkPasswordStrength (){

        System.out.println();
        if (password.length() <= 7){
            System.out.println("Password strength: Very week password!");
        } else if ((password.length() >= 8) && (counterOfDigits == 0 || counterOfCapitalLetters == 0 || counterOfSpecialSigns == 0)){
            System.out.println("Password strength: Weak password!");
        } else if ((password.length() >= 8) && (counterOfDigits == 1 || counterOfCapitalLetters == 1 || counterOfSpecialSigns == 1)){
            System.out.println("Password strength: Medium strength password.");
        } else if ((password.length() >= 8) && (counterOfDigits == 2 || counterOfCapitalLetters == 2 || counterOfSpecialSigns == 2)) {
            System.out.println("Password strength: Strong password.");
        } else if ((password.length() >= 8) && (counterOfDigits > 2 || counterOfCapitalLetters > 2 || counterOfSpecialSigns > 2)){
            System.out.println("Password strength: Very strong password :)");
        }

    }

}
