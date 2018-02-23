package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class CheckResultsPage {


    @FindBy(xpath="//*[@id='header-search']")
    public WebElement headerSearch;

    //Добавила список элементов, которые получаем после поиска
    @FindBy(xpath="//div[@class='n-snippet-card2__title']")
    public List<WebElement> listResultSeach;


    //в кадом PageObject должен быть конструкто, в котором выполняется PageFactory.initElements(BaseSteps.getDriver(), this);
    //иначе при попытке обратиться к элментам объявленным через FindBy получим NullPointerException
    // @FindBy - аналог findElement
    public CheckResultsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    // метод который возвразает количество найденных элементов
    public Integer getSeacrhProductCount() {
        return listResultSeach.size();
    }
}