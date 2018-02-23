package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("выполнено нажатие на Маркет")
    public static void selectMenuItem(String маркет){ new MainPage.sendAppBtn.click();
    }

}
