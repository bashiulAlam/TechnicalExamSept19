package pom.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.FacebookLoginPage;

public class FacebookLoginTestCase extends TestBase {
    @Test
    public void login() {
        FacebookLoginPage facebookLoginPage = PageFactory.initElements(driver, FacebookLoginPage.class);

        facebookLoginPage.setEmail("sabab.ndc@gmail.com");
        facebookLoginPage.setPass("wrongPass");
        //facebookLoginPage.clickLoginButton();
    }
}
