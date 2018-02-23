package steps;

import org.junit.Assert;
import pages.CheckResultsPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class CheckResultSteps {
//
//    int count  = Driver.findElements( By.xpath( "(//div[@class='n-snippet-card2__title'])" ) ).size();
//
//    String name = Driver.findElement( By.xpath( "(//div[@class='n-snippet-cell2__title'])[1]" ) ).getText();

// Локаторы для элементов вынесла в класс CheckResultPAge
    @Step("выполнено нажатие на Найти")
    public static void stepClickToBanner() {

    }

    //здесь должна быть проверка что название первого элемента соответствует значению, указанному в окне поиска перед нажатием на Найти
    @Step("заголовок страницы - Яндекс маркет равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = new CheckResultsPage().headerSearch.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

//метода проверяет, что найдено нужно кол-во элементов
    @Step
    public void checkCountProducts(Integer count) {
        Integer actual = new CheckResultsPage().getSeacrhProductCount();
        Assert.assertEquals("Найдено " + actual +" товаров. Ожидалось " + count + ".", count, actual);
    }


    //заполяняем поле - Поиск
    @Step
    public void fillFieldSeacrh(String searchInput) {
        new CheckResultsPage().headerSearch.sendKeys(searchInput);
    }
}
