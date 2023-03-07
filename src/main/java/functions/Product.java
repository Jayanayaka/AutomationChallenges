package functions;

import pages.HomePage;
import pages.ProductPage;

public class Product {
    public static ProductPage productPage = new ProductPage();

    public static void clickAddToCart() {
        productPage.clickAddToCart();
    }

    public static void navigateToBackToProduct() {
        productPage.navigateToBackToProduct();
    }
}
