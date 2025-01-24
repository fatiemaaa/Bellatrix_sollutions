package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P04_LoginPage;

import static util.Utility.*;

public class TC04_Login extends TestBase{
//    P05_LoginPage loginPage;

     String EMAIL = generateRandomGmail() ;
     String PASSWORD = generateRandomPassword(7);

    @Test(priority = 1, description = "Login With Valid Credentials")
    public void loginWithValidCredentials() throws InterruptedException {
        String actualMessage = new P04_LoginPage(driver).getMessageForCHECK_FINISH_ORDER();

        String expectedMessage = "Order received";
        System.out.println("Actual Message: " + actualMessage);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        softAssert.assertAll();

        System.out.println(actualMessage);

    }
}
