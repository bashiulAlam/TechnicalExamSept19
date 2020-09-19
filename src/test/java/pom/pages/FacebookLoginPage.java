package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
    WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "email")
    WebElement email;

    @FindBy(how = How.ID, using = "pass")
    WebElement password;

    @FindBy(how = How.NAME, using = "login")
    WebElement loginButton;

    public void setEmail(String searchStr) {
        email.sendKeys(searchStr);
    }

    public void setPass(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
