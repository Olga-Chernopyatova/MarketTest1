package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    ChooseElectronicsTVSteps chooseElectronicsTVSteps = new ChooseElectronicsTVSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    CheckResultSteps  checkResultsSteps = new CheckResultSteps();

    // используем объекты нужных классов степов которые создали - MainPageSteps mainPageSteps = new MainPageSteps(); и т.д
    //не надо делать статические методы для степов, получим из-за это NullPointerException
    //методы степов должны быть динамическими
    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбрана группа товаров \"(.+)\"$")
    public void selectMenuGroupItem(String menuName){
        chooseElectronicsTVSteps.selectMenuItem(menuName);
    }

    @When ("выполнен выбор типа электроники \"(.+)\"$")
    public void selectMenuProductTypeItem(String menuName) {
        chooseElectronicsTVSteps.selectTypeProductItem(menuName);
    }

    @When("заполняются поля:")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));
    }

    @When("найдено (.*) товаров")
    public void stepClickToBanner(Integer count) {
        checkResultsSteps.checkCountProducts(count);
    }

    @When("заполнено поле поиска значением (.*)")
    public void fillSearchField(String searchInput){
        checkResultsSteps.fillFieldSeacrh(searchInput);
    }

    @When("выполнено нажатие на Найти")
    public void stepClickToSearch() {
        CheckResultSteps.stepClickToBanner();
    }


}