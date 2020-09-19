package pom.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sabab on 9/16/2020.
 */
public class LoginTestCase extends TestBase {
    @Test
    public void login() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.setUserName("qa_operator");
        loginPage.setPassword("Konasl@123");

        loginPage.clickLoginButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
