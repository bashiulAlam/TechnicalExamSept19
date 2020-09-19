package pom.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sabab on 9/16/2020.
 */
public class TestBase {
    public static String baseUrl = "https://www.facebook.com/";
    public static WebDriver driver = null;

    public static ExtentTest test;
    public static ExtentReports report;

    @BeforeClass
    public static void setUp() {
        report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport.html");
        test = report.startTest("TestBase");

        System.setProperty("webdriver.gecko.driver", "D:\\Software\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);

        if (driver.getTitle().contains("Facebook"))
            test.log(LogStatus.PASS, "Navigated to facebook.com");
        else
            test.log(LogStatus.FAIL, "Could not load URL");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quit() {
        report.endTest(test);
        report.flush();
        TestBase.driver.quit();
    }
}
