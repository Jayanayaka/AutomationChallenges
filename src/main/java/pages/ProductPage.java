package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.imwebUI;

import static utils.imwebUI.driver;

public class ProductPage {
    private String BtnAddCart = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String BtnBackToProduct = "//button[@id='back-to-products']";
    public WebDriver clickAddToCart() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnAddCart)));
        driver.findElement(By.xpath(BtnAddCart)).click();
        return driver;
    }
    public WebDriver navigateToBackToProduct() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnBackToProduct)));
        driver.findElement(By.xpath(BtnBackToProduct)).click();
        return driver;
    }



}
