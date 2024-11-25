package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.P01_HomePage;

import org.testng.annotations.Test;

public class TC01_Home extends TestBase {

    @Test(priority = 1, description = "Product Add To Cart")
    public void addProductsToCart() throws InterruptedException {
//        P01_HomePage homePage = new P01_HomePage(driver);
//        homePage.selectFirstProduct();  // Selecting the first product and adding to cart
//        homePage.viewCart();
        new P01_HomePage(driver).selectFirstProduct().viewCart();
        // Viewing the cart to ensure that  the item is added
    }
//    @Test(priority = 1, description = "Select a random category, hover and open sub-category if found")
//    public void testSelectRandomCategory() {
//        P01_HomePage homePage = new P01_HomePage(driver);
//        homePage.selectRandomCategoryAndHover();
//        // Add assertions if needed to verify the behavior
//    }

}

