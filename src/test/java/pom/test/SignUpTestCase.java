package pom.test;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pom.pages.SignUpPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SignUpTestCase extends TestBase {
    @Test
    public void signUp() throws AWTException {
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        //Step 1: Tell us about yourself
        signUpPage.setFirstName("Bashiul");
        signUpPage.setLastName("Alam");

        //set Invalid email
        signUpPage.setEmail("wrongEmail");
        //signUpPage.clickAnywhere(50, 50);

        signUpPage.setBirthDay(1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String errorMsg = signUpPage.getEmailValidationError();

        if (errorMsg.contains("Enter valid email")) {
            test.log(LogStatus.PASS, "Wrong email validation passed");
        } else {
            test.log(LogStatus.FAIL, "Email validation failed");
        }

        //set valid email
        signUpPage.clearField(signUpPage.getEmailElem());
        signUpPage.setEmail("sabab.ndc@gmail.com");

        //signUpPage.setBirthDay(1);
        signUpPage.setBirthMonth(1);
        signUpPage.setBirthYear(3);

        signUpPage.clickBlueButton();

        /*//Step 2: Add your address
        signUpPage.setCity("Dhaka");
        signUpPage.setZip("1207");
        signUpPage.setCountry("Bangladesh");

        signUpPage.clickPullRightButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Step 3: Tell us about your devices
        //device will be auto detected, forwarding to the last step
        signUpPage.clickPullRightButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Step 4: The last step
        signUpPage.setPass("MyPass123");
        signUpPage.setConfirmPass("MyPass123");
        signUpPage.clickPrivacySetting();
        signUpPage.clickTermsOfUse();
        signUpPage.clickCompleteButton();*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
