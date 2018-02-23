import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.sql.Driver;
import java.util.HashMap;

public class MarketTest extends BaseSteps {

    @Test
    @Title("Яндекс маркет")
    public void testMarket () {

        MainPageSteps mainPageSteps = new MainPageSteps();
        ChooseElectronicsTVSteps chooseElectronicsTVSteps = new ChooseElectronicsTVSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();
        CheckResultSteps  checkResultsSteps = new CheckResultSteps();

        HashMap<String, String> testData = new HashMap<>();

        testData.put("от", "20000");


        MainPageSteps.selectMenuItem("Маркет");

        ChooseElectronicsTVSteps.checkPageTitle("Яндекс маркет");
        ChooseElectronicsTVSteps.selectMenuItem("Электроника");
        ChooseElectronicsTVSteps.selectMenuType("Телевизоры");

        sendAppSteps.fillFields();
        sendAppSteps.stepClickToBanner();

    }

    @Ignore
    public void MarketTest () {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[contains(text(),'маркет')]")).click();
        driver.findElement(By.xpath("//li/*[contains(text(),'Электроника')]")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        WebElement sendbtn= driver.findElement(By.xpath("//*[contains(@class, 'topmenu__subitem_nid_59601')]"));
        wait.until(ExpectedConditions.visibilityOf(sendbtn)).click();

        Assert.assertEquals("Телевизоры", title.getText());

        driver.findElement(By.xpath("//*[@id='glf-pricefrom-var']"));

        fillField(By.name("pricefrom"), "20000");

        Assert.assertEquals("20000",
                driver.findElement(By.name("pricefrom")).getAttribute( "value"));

        driver.findElement(By.name("LG")).click();
        driver.findElement(By.name("Samsung")).click();

        driver.findElement(By.xpath("//*[contains(text(),'Применить')]")).click();
        driver.findElements(By.xpath( "(//div[@class='n-snippet-card2__title'])" ) ).size();
        driver.findElement( By.xpath( "(//div[@class='n-snippet-cell2__title'])[1]" ) ).getText();
        driver.findElement(By.xpath("//*[contains(text(),'Найти')]")).click();

    }

}
    }
