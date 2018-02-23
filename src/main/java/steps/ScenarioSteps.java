package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    ChooseElectronicsTVSteps chooseElectronicsTVSteps = new ChooseElectronicsTVSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    CheckResultSteps  checkResultsSteps = new CheckResultSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        MainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбрана группа товаров \"(.+)\"$")
    public void selectMenuItem(String menuName){
        ChooseElectronicsTVSteps.selectMenuItem(menuName);
    }

    @When ("выполнен выбор типа электроники Телевизоры")
    public void selectMenuItem() {
        ChooseElectronicsTVSteps.selectMenuItem();
    }

    @When("выплнено переключение в новое окно")
    public void stepSwitchToWindow(){
        ChooseElectronicsTVSteps.stepSwitchToWindow();
    }

    @When("заполняются поля")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> SendAppSteps.fillField(field, value));

        @When("выполнено нажатие на Применить")
    public void stepClickToBanner() {
        SendAppSteps.stepClickToBanner();
    }
        @When("заполнено поле поиска")
        public void fillForm(DataTable fields){
            fields.asMap(String.class, String.class)
                    .forEach((field, value) -> CheckResultSteps.fillField(field, value));

        @When("выполнено нажатие на Найти")
        public void stepClickToBanner() {
            CheckResultSteps.stepClickToBanner();
        }

    }
}