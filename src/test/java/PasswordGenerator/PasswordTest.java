package PasswordGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    public void createsPasswordTestLength_01(){

        Password password = new Password();
        String createdPassword = password.createsPassword();

        Assertions.assertNotEquals(17, createdPassword.length());

    }

    @Test
    public void createsPasswordTestLength_02(){

        Password password = new Password();
        String createdPassword = password.createsPassword();

        Assertions.assertNotEquals(15, createdPassword.length());

    }

    @Test
    public void createsPasswordTestLength_03(){

        Password password = new Password();
        String createdPassword = password.createsPassword();

        Assertions.assertEquals(16, createdPassword.length());

    }

    @Test
    public void createsPasswordTestCharacters_01(){

        Password password = new Password();
        String createdPassword01 = password.createsPassword();
        String createdPassword02 = password.createsPassword();

        Assertions.assertNotEquals(createdPassword02, createdPassword01);

    }

    @Test
    public void createsPasswordTestCharacters_02(){

        Password password = new Password();
        String createdPassword = password.createsPassword();
        String text = "j#Km)W0%m0Klm&w2";

        Assertions.assertNotEquals(text, createdPassword);

    }

    @Test
    public void createsPasswordTestCharacters_03(){

        Password password = new Password();
        String createdPassword = password.createsPassword();

        Assertions.assertNotNull(createdPassword);

    }

}
