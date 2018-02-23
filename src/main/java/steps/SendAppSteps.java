package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.InsurancePage;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.sql.Driver;
import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;

public class SendAppSteps {


    @Step("поле {0} заполняется значением {1}")
    public static void fillField(String field, String value){
        new SendAppPage(BaseSteps.getDriver()).fillField(field, value);
        Driver.findElement(By.name("LG")).click();
        Driver.findElement(By.name("Samsung")).click();
    }



    @Step("выполнено нажатие на Применить")
    public static void stepClickToBanner() {
        new SendAppPage(BaseSteps.getDriver()).bannerBtn.click();
        Driver.findElement(By.xpath("//*[contains(text(),'Применить')]")).click();
    }
    public static stepClickToBanner() {
    }

    public static fillFields(HashMap<String, String> testData) {
    }
}
