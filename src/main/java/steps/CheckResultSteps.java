package steps;

import org.openqa.selenium.By;
import pages.CheckResultsPage;
import pages.ChooseElectronicsTVPage;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.sql.Driver;

import static org.junit.Assert.assertTrue;

public class CheckResultSteps {

    int count  = Driver.findElements( By.xpath( "(//div[@class='n-snippet-card2__title'])" ) ).size();

    String name = Driver.findElement( By.xpath( "(//div[@class='n-snippet-cell2__title'])[1]" ) ).getText();

    @Step("поле {0} заполняется значением {1}")
    public static void fillField(String field, String value){
        new CheckResultsPage(BaseSteps.getDriver()).fillField(field, value);

    }

    @Step("выполнено нажатие на Найти")
    public static void stepClickToBanner() {
        new CheckResultsPage(BaseSteps.getDriver()).bannerBtn.click();
        Driver.findElement(By.xpath("//*[contains(text(),'Найти')]")).click();
    }

    //здесь должна быть проверка что название первого элемента соответствует значению, указанному в окне поиска перед нажатием на Найти
    @Step("заголовок страницы - Яндекс маркет равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = new CheckResultsPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }
}
