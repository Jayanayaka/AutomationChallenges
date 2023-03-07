package functions;

import pages.CartPage;
import pages.ProductPage;

public class Cart {
    public static CartPage cartPage = new CartPage();
    public static void navigateToCheckOut() {
        cartPage.navigateToCheckOut();
    }
}
