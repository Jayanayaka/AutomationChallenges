package tests;

import common.Constant;
import functions.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestBase;

import java.io.IOException;

public class OderDetailsPageTest extends TestBase {

    @BeforeMethod
    public void navigateToHomePage() {
        Login.login(Constant.Email, Constant.Password);
        Assert.assertEquals(Home.getActTitle(), Home.getExpTitle());
    }
    @Test
    public void testVerifyOderDetailsPage () throws IOException, InterruptedException {
        Home.navigateToFirstProduct();
        Product.clickAddToCart();
        Product.navigateToBackToProduct();
        Home.navigateToSecondProduct();
        Product.clickAddToCart();
        Product.navigateToBackToProduct();
        Home.navigateToCart();
        Cart.navigateToCheckOut();
        UserDetails.enterUserDetails();
        UserDetails.clickFinish();
        Assert.assertEquals(OderComplate.getOderCompleteSuccessMsg(), "Thank you for your order!");

    }
}
