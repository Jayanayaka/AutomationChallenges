package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.imwebUI;

import static utils.imwebUI.driver;

public class CartPage {

    private String BtnCheckOut = "//button[@id='checkout']";

    public WebDriver navigateToCheckOut() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnCheckOut)));
        driver.findElement(By.xpath(BtnCheckOut)).click();
        return driver;
    }



}
