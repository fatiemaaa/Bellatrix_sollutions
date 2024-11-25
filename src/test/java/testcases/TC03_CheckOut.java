package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P03_CheckOutPage;
import pages.PageBase;
import org.testng.asserts.SoftAssert;

import static util.Utility.*;

public class TC03_CheckOut extends TestBase {
    String firstName = getRandomName();
    String lastname = getRandomName();
    String streetaddress = generateStreetName();
    String postalCode = generatePostalCode(6);
    String cityname = generateCityName();
    String email = generateRandomGmail();
    String phoneNumber = generatePhoneNumber();


    @Test(priority = 1, description = "Validate Placing Order Successfully")
    public void ValidtePlacingOrderSuccessfully() throws InterruptedException {

        // Other variables can be initialized similarly
        new PageBase(driver).scrollDown();

        new P03_CheckOutPage(driver).enterFirstName(firstName)
                .enterLastName(lastname)
                .selectCountryDropDown("Germany")
                .enterStreetAddress(streetaddress)
                .enterCityName("Munich")
                .selectStateDropDown("Bavaria")
                .enterPhoneNumber(phoneNumber)
                .enterEmailAddress(email)
                .clickOnCreateAnAcct().enterZipCode("80331").clickOnPlaceOrder();

        Thread.sleep(10000);



    }


}
