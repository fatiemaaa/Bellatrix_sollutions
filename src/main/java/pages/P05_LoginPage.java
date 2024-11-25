package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.longWait;

public class P05_LoginPage {

    //1- Webdriver Declaration
    //2- constructor
    //3- Locators
    //4- Public Action Method

    WebDriver driver;



    public P05_LoginPage(WebDriver driver){
        this.driver= driver;
    }
    private final By ORDER_RECIVED_MESSAGE = By.xpath("//h1[@class='entry-title']");

    public String getMessageForCHECK_FINISH_ORDER() {
        longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(ORDER_RECIVED_MESSAGE));


        return driver.findElement(ORDER_RECIVED_MESSAGE).getText();
    }
}
