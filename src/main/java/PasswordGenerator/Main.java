package PasswordGenerator;

public class Main {

    public static void main(String[] args) {

        PasswordStrength passwordStrength = new PasswordStrength();
        CharactersStatistics charactersStatistics = new CharactersStatistics();

        passwordStrength.checksNumberOfCharacters();
        passwordStrength.checksNumberOfDigits();
        passwordStrength.checksNumberOfCapitalLetters();
        passwordStrength.checksNumberOfSpecialSigns();
        charactersStatistics.countsIndividualCharactersOfPassword();
        passwordStrength.checkPasswordStrength();

    }

}
