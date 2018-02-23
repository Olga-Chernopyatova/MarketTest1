package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckResultsPage {


    @FindBy(xpath="//*[@id='header-search']")
    public WebElement headerSearch;

    public CheckResultsPage(WebDriver driver) {
    }
}