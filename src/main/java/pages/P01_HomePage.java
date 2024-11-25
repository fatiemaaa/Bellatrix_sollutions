package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class P01_HomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
    }

    // Locators
    private final By FIRST_PRODUCT_Add_TO_Cart = By.xpath("//*[@id='main']/ul/li[1]//a[contains(@class, 'add_to_cart_button')]");
    private final By VIEWCART = By.xpath("//a[@title='View cart']");

    // Method to select the first product and add to cart
    public P01_HomePage selectFirstProduct() throws InterruptedException {
        WebElement productButton = wait.until(ExpectedConditions.elementToBeClickable(FIRST_PRODUCT_Add_TO_Cart));
        System.out.println("Selecting first product: " + productButton.getAttribute("href"));
        productButton.click();
        return this;
    }

    // Method to view cart
    public P01_HomePage viewCart() {
        WebElement viewCartButton = wait.until(ExpectedConditions.elementToBeClickable(VIEWCART));
        viewCartButton.click();
        return this;
    }

}
