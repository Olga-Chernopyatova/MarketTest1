package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy (xpath = "//*[contains(text(),'маркет')]")
    WebElement mainMenu;


    public MainPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void selectMenuItem(String menuItem){
        mainMenu.findElement(By.xpath("//*[contains(text(),'маркет')]")).click();

}

}
