package steps;

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SendAppSteps {


    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new SendAppPage(BaseSteps.getDriver()).fillField(field, value);
    }



}
