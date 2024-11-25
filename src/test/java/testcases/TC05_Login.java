package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P04_SubmitPage;
import pages.P05_LoginPage;

import static util.Utility.*;

public class TC05_Login extends TestBase{
//    P05_LoginPage loginPage;

     String EMAIL = generateRandomGmail() ;
     String PASSWORD = generateRandomPassword(7);

    @Test(priority = 1, description = "Login With Valid Credentials")
    public void loginwithvalidcredentials() throws InterruptedException {
        String actualMessage = new P05_LoginPage(driver).getMessageForCHECK_FINISH_ORDER();

        String expectedMessage = "Order received";
        System.out.println("Actual Message: " + actualMessage);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        softAssert.assertAll();

        System.out.println(actualMessage);

    }
}
