package lt.techin.praktinis.test;

import lt.techin.praktinis.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginTest extends BaseTest {


    @Test
    void getLoginCredential() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("Admin");
//        palaukti();
        loginPage.enterPassword("admin123");
//        palaukti();
        loginPage.clickLoginButton();
//        palaukti();
        Assertions.assertEquals("My Actions", loginPage.equalsMyActions());
//        palaukti();
    }


}

