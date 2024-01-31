package lt.techin.praktinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//form//input[contains(@name, 'username')]")
    //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
    WebElement usernameField;

    @FindBy(xpath = "//form//input[contains(@name, 'password')]")

    WebElement passwordField;

    @FindBy(css = ".orangehrm-login-button")
    //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
    WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div/p")
    WebElement myActions;

    @FindBy(xpath = ".oxd-alert-content--error")
    WebElement errorMessage;

    @FindBy(xpath = "//div[contains(@class, 'orangehrm-demo-credentials')]/p[1]")
    WebElement username;

    @FindBy(xpath = "//div[contains(@class, 'orangehrm-demo-credentials')]/p[2]")
    WebElement password;


    public void enterUsername(String username) {
        this.usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        clickButton.click();
    }
    public String equalsMyActions() {
        return myActions.getText();
    }
    public String errorMessageAppear(){
        return errorMessage.getText();
    }

public String userNameFromPage(){
        return username.getText().split(":")[1].trim();
}

    public String passwordFromPage(){
        return password.getText().split(":")[1].trim();
    }

}
