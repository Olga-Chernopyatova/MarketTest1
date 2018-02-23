package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class SendAppPage {

    @FindBy(xpath="//*[@id='glf-pricefrom-var']")
    public WebElement pricefrom;

    Driver.findElement(By.name("LG")).click();
    Driver.findElement(By.name("Samsung")).click();

    Driver.findElement(By.xpath("//*[contains(text(),'Применить')]")).click();

    public SendAppPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(sendBtn));
    }

    public void fillField(String field, String value) {
        switch (field) {
            case "insured0_surname":
                fillField(pricefrom, value);
                break;
            case "LG":
            Driver.findElement(By.name("LG")).click();
                break;
            case "Samsung":
            Driver.findElement(By.name("Samsung")).click();
                break;

            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");

                Driver.findElement(By.xpath("//*[contains(text(),'Применить')]")).click();
        }
    }

    public String getFillField(String field) {
        switch (field) {
            case "pricefrom":
                return pricefrom.getAttribute("value");
            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");
        }
    }

    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
