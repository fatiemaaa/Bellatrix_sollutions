package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.PageBase.shortWait;
import static util.Utility.generateRandomInt;

public class P03_CheckOutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public P03_CheckOutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Wait up to 10 seconds
    }

    private final By First_Name = By.xpath("//input[@id='billing_first_name']");
    private final By Last_Name = By.xpath("//input[@id='billing_last_name']");
    private final By countryDropdown = By.id("billing_country");
    private final By Street_Address = By.xpath("//*[@id='billing_address_1']");
    private final By CITY_NAME = By.xpath("//*[@id='billing_city']");
    private final By STATE_DROPDOWN = By.xpath("//SELECT[@id='billing_state']");
    private final By ZIP_CODE = By.xpath("//input[@name='billing_postcode']");
    private final By Phone_Number = By.xpath("//input[@name='billing_phone']");
    private final By Email_Address = By.xpath("//input[@name='billing_email']");
    private final By CreateAnAcct = By.xpath("//input[@id='createaccount']");
    private final By Place_Order = By.id("place_order");
    private final By ORDER_RECIVED_MESSAGE = By.xpath("//h1[@class='entry-title']");

    public P03_CheckOutPage enterFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.First_Name)).sendKeys(firstname);
        return this;
    }

    public P03_CheckOutPage enterLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Last_Name)).sendKeys(lastname);
        return this;
    }
    public P03_CheckOutPage selectCountryDropDown(String country) {

//        Select countrySelect=new Select(driver.findElement(COUNTRY));
//        countrySelect.selectByIndex(generateRandomInt(1,10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(this.countryDropdown));
        // Find the dropdown element and create a Select object
        Select countrySelect = new Select(driver.findElement(this.countryDropdown));

        // Select the country by visible text
        countrySelect.selectByVisibleText(country);

        return this;
    }


    public P03_CheckOutPage enterStreetAddress(String streetaddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Street_Address)).sendKeys(streetaddress);
        return this;
    }

    public P03_CheckOutPage enterCityName(String cityname) throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.CITY_NAME)).sendKeys(cityname);
        return this;
    }
    public P03_CheckOutPage selectStateDropDown(String state) throws InterruptedException {
        Select countrySelect = new Select(driver.findElement(this.STATE_DROPDOWN));
        countrySelect.selectByVisibleText(state);
        return this;
    }

    public P03_CheckOutPage enterZipCode(String zipcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.ZIP_CODE)).sendKeys(zipcode);
        return this;
    }

    public P03_CheckOutPage enterPhoneNumber(String phonenumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Phone_Number)).sendKeys(phonenumber);
        return this;
    }

    public P03_CheckOutPage enterEmailAddress(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Email_Address)).sendKeys(email);
        return this;
    }

    public P03_CheckOutPage clickOnCreateAnAcct() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(this.CreateAnAcct)).click();
        Thread.sleep(5000);
        return this;
    }

    public P03_CheckOutPage clickOnPlaceOrder() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(this.Place_Order)).click();
        Thread.sleep(20000);
        return this;
    }

    
}
