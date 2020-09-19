package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Sabab on 9/16/2020.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "username")
    WebElement userNameField;

    @FindBy(how = How.ID, using = "password")
    WebElement passwordField;

    @FindBy(how = How.ID, using = "login_btn")
    WebElement loginButton;

    public void setUserName(String userName) {
        userNameField.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
