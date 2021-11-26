package PasswordGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

    @Test
    public void checksNumberOfCharactersTestLength01(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfCharacters();

        Assertions.assertNotEquals(17, integer);

    }

    @Test
    public void checksNumberOfCharactersTestLength02(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfCharacters();

        Assertions.assertEquals(16, integer);

    }

    @Test
    public void checksNumberOfCharactersTestNotNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfCharacters();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfDigitsNotNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfDigits();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfDigitsNotEqualsNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfDigits();

        Assertions.assertNotEquals(null, integer);

    }

    @Test
    public void checksNumberOfCapitalLettersNotNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfCapitalLetters();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfCapitalLettersNotEqualsNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfCapitalLetters();

        Assertions.assertNotEquals(null, integer);

    }

    @Test
    public void checksNumberOfSpecialSignsNotNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfSpecialSigns();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfSpecialSignsNotEqualsNull(){

        PasswordStrength passwordStrength = new PasswordStrength();
        Integer integer = passwordStrength.checksNumberOfSpecialSigns();

        Assertions.assertNotEquals(null, integer);

    }

}
