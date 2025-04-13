package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    private LoginController loginController;
    private LoginController loginControllerControl;


    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.loginController = new LoginController(
                "src/test/resources/Cesaeland_logins.csv"
        );

        this.loginControllerControl = new LoginController(
                "src/test/resources/Cesaeland_logins_control.csv"
        );

    }

    @Test
    void validLoginTest() {
        String result = loginController.accessType("ceo", "cesaeland");
        assertEquals("ADMIN", result);
    }

    @Test
    void invalidUsernameTest() {
        String result = loginController.accessType("usertest", "passwordtest");
        assertEquals("erro", result);
    }

    @Test
    void invalidPasswordTest() {
        String result = loginController.accessType("ceo", "passwordtest");
        assertEquals("erro", result);
    }

}


