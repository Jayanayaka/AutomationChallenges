package pages;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtil;
import utils.imwebUI;

public class HomePage {


    WebDriver driver;
    WebDriverWait wait;
    private String expectedTitleHomePage = "Swag Labs";

    private String actualTitleHomePage = "//div[@id='']";

    private String BtnLoginIn = "//header/div[1]/section[1]/div[2]/div[3]/span[1]/a[2]";
    private String BtnAddCart = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String BtnProductName = "//a[@id='item_4_title_link']";
    private String BtnProduct2Name = "//a[@id='item_1_title_link']";
    private String BtnCart = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]";




    public HomePage(){


    }
    public String getActualTitleHomePage(){
        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(actualTitleHomePage)));
        return imwebUI.driver.findElement(By.xpath(actualTitleHomePage)).getText();

    }

    public WebDriver navigateToFirstProduct() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnProductName)));
        imwebUI.driver.findElement(By.xpath(BtnProductName)).click();
        return driver;
    }
    public WebDriver navigateToCart() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnCart)));
        imwebUI.driver.findElement(By.xpath(BtnCart)).click();
        return driver;
    }
    public WebDriver navigateToSecondProduct() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnProduct2Name)));
        imwebUI.driver.findElement(By.xpath(BtnProduct2Name)).click();
        return driver;
    }
    public String getExpectedTitleHomePage(){
        return expectedTitleHomePage;
    }






}
