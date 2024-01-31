package lt.techin.praktinis.test;

import lt.techin.praktinis.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginTest extends BaseTest {

private LoginPage loginPage;
    @BeforeEach
    void setUp() {
        loginPage = new LoginPage(driver);
    }

    @Test
    void corectLoginCredentials() {

        loginPage.enterUsername("Admin");

        loginPage.enterPassword("admin123");

        loginPage.clickLoginButton();

        Assertions.assertEquals("My Actions", loginPage.equalsMyActions());
    }
    @Test
    void wrongLoginCredentials() {

        loginPage.enterUsername("Admi");

        loginPage.enterPassword("admin12");

        loginPage.clickLoginButton();

        Assertions.assertEquals("Invalid credentials", loginPage.errorMessageAppear());
    }

@Test
    void corectLoginCredentials2(){

   String userPage= loginPage.userNameFromPage();
   loginPage.enterUsername(userPage);

   String passwordPage= loginPage.passwordFromPage();
    loginPage.enterPassword(passwordPage);

    loginPage.clickLoginButton();

    Assertions.assertEquals("My Actions", loginPage.equalsMyActions());
}


}

