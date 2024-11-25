package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P02_CartPage {

    //1- web declaration
    //2- constructor
    //3- locators
    //4- public action method

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public P02_CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
    }

    // Locators
    private final By PROCEEDTOCHECKOUT = By.xpath("//*[@id='post-6']/div/div/div[2]/div/div/a");

    // Method to click on the "Proceed to Checkout" button
    public P02_CartPage clickOnCheckOut() {
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(PROCEEDTOCHECKOUT));
        System.out.println("Clicking on Checkout button");
        checkoutButton.click();
        return this;
    }
}
