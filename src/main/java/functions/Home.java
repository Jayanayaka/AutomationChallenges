package functions;

import common.Constant;
import pages.HomePage;

public class Home {

    public static HomePage homePage = new HomePage();

    public static String getExpTitle(){
        return  homePage.getExpectedTitleHomePage();

    }

    public static String getActTitle(){
        return  homePage.getActualTitleHomePage();

    }

    public static void navigateToFirstProduct() {
        homePage.navigateToFirstProduct();
    }
    public static void navigateToSecondProduct() {
        homePage.navigateToSecondProduct();
    }
    public static void navigateToCart() {
        homePage.navigateToCart();
    }


}
