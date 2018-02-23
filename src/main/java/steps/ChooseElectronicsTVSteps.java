package steps;

import pages.ChooseElectronicsTVPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class ChooseElectronicsTVSteps {

    @Step("заголовок страницы - Яндекс маркет равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = "";//new ChooseElectronicsTVPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на Электроника")
    public  void selectMenuItem(String menuItem){
        new ChooseElectronicsTVPage().moveToMenu(menuItem);
    }


    @Step ("выбран тип электроники {0}")
    public  void selectTypeProductItem(String menuItem) {
        new ChooseElectronicsTVPage().selectSubMenu(menuItem);}


}
