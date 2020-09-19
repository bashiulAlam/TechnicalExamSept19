package pom.pages;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@name='firstName']")
    WebElement firstNameElem;

    @FindBy(how = How.ID, using = "lastName")
    WebElement lastNameElem;

    @FindBy(how = How.ID, using = "email")
    WebElement emailElem;

    @FindBy(how = How.ID, using = "birthDay")
    WebElement birthDayElem;

    @FindBy(how = How.ID, using = "birthMonth")
    WebElement birthMonthElem;

    @FindBy(how = How.ID, using = "birthYear")
    WebElement birthYearElem;

    @FindBy(how = How.ID, using = "city")
    WebElement cityElem;

    @FindBy(how = How.ID, using = "zip")
    WebElement zipElem;

    @FindBy(how = How.ID, using = "country")
    WebElement countryElem;

    @FindBy(how = How.ID, using = "password")
    WebElement password;

    @FindBy(how = How.ID, using = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(how = How.ID, using = "termOfUse")
    WebElement termOfUse;

    @FindBy(how = How.ID, using = "privacySetting")
    WebElement privacySetting;

    @FindBy(how = How.CLASS_NAME, using = "btn-blue")
    WebElement blueButton;

    @FindBy(how = How.CLASS_NAME, using = "btn btn-blue pull-right")
    WebElement pullRightButton;

    @FindBy(how = How.ID, using = "laddaBtn")
    WebElement completeButton;

    @FindBy(how = How.ID, using = "emailError")
    WebElement emailErrorMsg;

    public void setEmail(String email) {
        emailElem.sendKeys(email);
    }

    public String getEmailValidationError() {
        return emailErrorMsg.getText();
    }

    public void setPass(String pass) {
        password.sendKeys(pass);
    }

    public void setConfirmPass(String pass) {
        confirmPassword.sendKeys(pass);
    }

    public void clickBlueButton() {
        blueButton.click();
    }

    public void clickPullRightButton() {
        pullRightButton.click();
    }

    public void clickCompleteButton() {
        completeButton.click();
    }

    public void setFirstName(String firstName) {
        firstNameElem.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameElem.sendKeys(lastName);
    }

    public void setBirthDay(int birthDayIndex) {
        //birthDayElem.selectByVisibleText(birthDay);
        Select drop = new Select(birthDayElem);
        drop.selectByIndex(birthDayIndex);
    }

    public void setBirthMonth(int birthMonthIndex) {
        //birthMonthElem.selectByVisibleText(birthMonth);
        //birthMonthElem.selectByIndex(1);
        Select drop = new Select(birthMonthElem);
        drop.selectByIndex(birthMonthIndex);
    }

    public void setBirthYear(int birthYearIndex) {
        //birthYearElem.selectByVisibleText(birthYear);;
        //birthYearElem.selectByIndex(1);

        Select drop = new Select(birthYearElem);
        drop.selectByIndex(birthYearIndex);
    }

    public void setCity(String city) {
        cityElem.sendKeys(city);
    }

    public void setZip(String zip) {
        zipElem.sendKeys(zip);
    }

    public void setCountry(String country) {
        countryElem.sendKeys(country);
    }

    public void clickTermsOfUse() {
        termOfUse.click();
    }

    public void clickPrivacySetting() {
        privacySetting.click();
    }

    public void clickAnywhere(int x, int y) throws AWTException {
        Actions actions = new Actions(driver);

        Robot robot = new Robot();

        robot.mouseMove(x,y);

        actions.click().build().perform();
    }

    public void clearField(WebElement element) {
        element.clear();
    }

    public WebElement getEmailElem() {
        return this.emailElem;
    }
}
