package testcases;

import org.testng.annotations.Test;
import pages.P02_CartPage;

public class TC02_Cart extends TestBase{

//    P02_CartPage  cartpage;

    @Test(priority = 1, description = "Validate Click On Checkout btn")
    public void ClickOnCheckOut()  {
//        cartpage = new P02_CartPage(driver);
//        cartpage.ClickOnCheckOut();
        new P02_CartPage(driver).clickOnCheckOut();

    }
}
