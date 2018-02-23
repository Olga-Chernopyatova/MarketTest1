package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class ChooseElectronicsTVPage {


    @FindBy (xpath = "//li/*[contains(text(),'Электроника')]").click();
    WebElement mainMenu;

    @FindBy(xpath = "//*[contains(@class, 'topmenu__subitem_nid_59601')]")
    WebElement subMenu;

    public void selectSubMenu(String menuItem){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(subMenu.findElement(By.xpath(".//a[contains(text(),'"+ menuItem +"')]")))).click();
    }
}
