package pom.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.GoogleHomePage;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTestCase extends TestBase {
    @Test
    public void search() {
        GoogleHomePage googleHomePage = PageFactory.initElements(driver, GoogleHomePage.class);

        googleHomePage.setSearchField("fc barcelona");
        googleHomePage.clickSearchButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
