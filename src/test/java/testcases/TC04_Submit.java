package testcases;

import org.testng.annotations.Test;
import pages.P04_SubmitPage;

import static util.Utility.*;

public class TC04_Submit extends TestBase{





    String firstname = getRandomName();
    String lastname = getRandomName();


    @Test(priority = 1, description = "Validate Click On Sumbit Button")
    public void ValidateClickOnSumbitBtn() throws InterruptedException {
        new P04_SubmitPage(driver).enterFirstName(firstname).enterLastName(lastname)
                .selectAccessPass().selectSessionsAttend().selectOverNightAttend()
                .clickOnCheckBox().clickOnCaptcha().clickOnSubmitBtn();




    }
}
