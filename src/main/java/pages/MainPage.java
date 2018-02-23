package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    //данным локатором определим всю панельку меню
    @FindBy (xpath = "//div[@class='home-arrow__tabs']")
    WebElement mainMenu;


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //метод выбирает в зависимости от параметра любой пункт главного меню, не только маркет
    public void selectMenuItem(String menuItem){
        mainMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();

}

}
