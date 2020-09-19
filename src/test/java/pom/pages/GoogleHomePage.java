package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePage {
    WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "q")
    WebElement searchField;

    @FindBy(how = How.NAME, using = "btnK")
    WebElement searchButton;

    public void setSearchField(String searchStr) {
        searchField.sendKeys(searchStr);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
