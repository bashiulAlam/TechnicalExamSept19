package pom.pages;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "firstName")
    WebElement firstNameElem;

    @FindBy(how = How.ID, using = "lastName")
    WebElement lastNameElem;

    @FindBy(how = How.ID, using = "email")
    WebElement emailElem;

    @FindBy(how = How.ID, using = "birthDay")
    Select birthDayElem;

    @FindBy(how = How.ID, using = "birthMonth")
    Select birthMonthElem;

    @FindBy(how = How.ID, using = "birthYear")
    Select birthYearElem;

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

    @FindBy(how = How.CLASS_NAME, using = "btn btn-blue")
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

    public void setBirthDay(String birthDay) {
        birthDayElem.selectByVisibleText(birthDay);
        birthDayElem.selectByIndex(1);
    }

    public void setBirthMonth(String birthMonth) {
        birthMonthElem.selectByVisibleText(birthMonth);
        birthMonthElem.selectByIndex(1);
    }

    public void setBirthYear(String birthYear) {
        birthYearElem.selectByVisibleText(birthYear);;
        birthYearElem.selectByIndex(1);
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
}
