package PasswordGenerator;

public class Main {

    public static void main(String[] args) {

        PasswordStrength passwordStrength = new PasswordStrength();
        CharactersStatistics charactersStatistics = new CharactersStatistics();

        //place of calling all key methods that characterize the automatically generated password
        passwordStrength.checksNumberOfCharacters();
        passwordStrength.checksNumberOfDigits();
        passwordStrength.checksNumberOfCapitalLetters();
        passwordStrength.checksNumberOfSpecialSigns();
        charactersStatistics.countsIndividualCharactersOfPassword();
        passwordStrength.checkPasswordStrength();

    }

}
