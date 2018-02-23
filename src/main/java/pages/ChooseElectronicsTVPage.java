package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class ChooseElectronicsTVPage {


    @FindBy (xpath = "//ul[@class='topmenu__list']")
    WebElement mainMenu;

    @FindBy(xpath = "//div[@class='topmenu__sublist']")
    WebElement subMenu;

    // не забываем про конструтор, в котором выполняется   PageFactory.initElements(BaseSteps.getDriver(), this);
    public ChooseElectronicsTVPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectSubMenu(String menuItem){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(subMenu.findElement(By.xpath(".//*[contains(text(),'"+ menuItem +"')]")))).click();
    }

    //метод наводит мышь на пункт меню в нашем случае - Электроника, но в параметрах можем передать любой другой пукнт меню
    // наведение на элмент выполняется с помощью оюъекта Actions  и его метода moveTElement
    public void moveToMenu(String menuItem){
        new Actions(BaseSteps.getDriver())
                .moveToElement(mainMenu.findElement(By.xpath(".//li[@data-department='"+menuItem+"']"))).perform();
    }
}
