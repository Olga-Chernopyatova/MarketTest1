package steps;

import pages.ChooseElectronicsTVPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.sql.Driver;

import static org.junit.Assert.assertTrue;

public class ChooseElectronicsTVSteps {
    public static selectMenuItem(String) {
    }

    public static stepGoToSendAppPage() {
    }

    public static selectMenuType(String) {
    }

    public static stepSwitchToWindow() {
    }
    @Step("заголовок страницы - Яндекс маркет равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = new ChooseElectronicsTVPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на Электроника")
    public static void selectMenuItem(){
        new ChooseElectronicsTVPage().sendAppBtn.click();
    }


    @Step ("выбран тип электроники {0}")
    public static void selectMenuItem(String menuItem) {
        new ChooseElectronicsTVPage(Driver).selectSubMenu(menuItem);}

    @Step ("выплнено переключение в новое окно")
    public static void stepSwitchToWindow(){
        ChooseElectronicsTVSteps.stepSwitchToWindow();
    }

}
