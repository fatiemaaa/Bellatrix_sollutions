package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P04_SubmitPage {
    // 1- WebDriver declaration
    private WebDriver driver;
    private WebDriverWait wait;

    // 2- Constructor
    public P04_SubmitPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 3- Locators
    private final By FIRSTNAME = By.xpath("//input[@id='wpforms-3347-field_1']");
    private final By LASTNAME = By.xpath("//input[@id='wpforms-3347-field_1-last']");
    private final By ACCESSPASS = By.xpath("//input[@id='wpforms-3347-field_3_1']");
    private final By SESSIONS = By.xpath("//input[@id='wpforms-3347-field_4_1']");
    private final By OVERNIGHTATTEND = By.xpath("//input[@id='wpforms-3347-field_5_1']");
    private final By CHECKBOX = By.xpath("//input[@id='wpforms-3347-field_6_1']");
    private final By CAPTCHA = By.xpath("//div[@class='recaptcha-checkbox-border']");
    private final By SUBMITBTN = By.xpath("//button[@id='wpforms-submit-3347']");

    // 4- Public action methods
    public P04_SubmitPage enterFirstName(String firstname) throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FIRSTNAME)).sendKeys(firstname);
        return this;
    }

    public P04_SubmitPage enterLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LASTNAME)).sendKeys(lastname);
        return this;
    }

    public P04_SubmitPage selectAccessPass() {
        wait.until(ExpectedConditions.elementToBeClickable(ACCESSPASS)).click();
        return this;
    }

    public P04_SubmitPage selectSessionsAttend() {
        wait.until(ExpectedConditions.elementToBeClickable(SESSIONS)).click();
        return this;
    }

    public P04_SubmitPage selectOverNightAttend() {
        wait.until(ExpectedConditions.elementToBeClickable(OVERNIGHTATTEND)).click();
        return this;
    }

    public P04_SubmitPage clickOnCheckBox() {
        wait.until(ExpectedConditions.elementToBeClickable(CHECKBOX)).click();
        return this;
    }

    public P04_SubmitPage clickOnCaptcha() {
        wait.until(ExpectedConditions.elementToBeClickable(CAPTCHA)).click();
        return this;
    }

    public P04_SubmitPage clickOnSubmitBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(SUBMITBTN)).click();
        return this;
    }
}
