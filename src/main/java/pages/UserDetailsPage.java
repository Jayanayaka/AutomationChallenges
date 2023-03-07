package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.imwebUI;

import static utils.imwebUI.driver;

public class UserDetailsPage {



    private String TxtPostalCode = "//select[@id='manufacturer']";
    private String TxtFirstName = "//input[@id='first-name']";
    private String TxtLastName = "//input[@id='last-name']";
    private String BtnContinue = "//input[@id='postal-code']";
    private String BtnFinish = "//button[@id='finish']";

    String firstName;
    String lastName;
    String postalCode;
    public void typePostalCode(String postalCode){
        imwebUI.driver.findElement(By.xpath(TxtPostalCode)).sendKeys(postalCode);
        this.postalCode = postalCode;
    }

    public WebDriver typeFirstName(String firstName){
        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(TxtFirstName)));
        imwebUI.driver.findElement(By.name(TxtFirstName)).sendKeys(firstName);
        return driver;

    }

    public WebDriver typeLastName(String lastName){
        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(TxtLastName)));
        imwebUI.driver.findElement(By.name(TxtLastName)).sendKeys(lastName);

        return driver;
    }
    public void clickContinue() { driver.findElement(By.xpath(BtnContinue)).click(); }

    public void clickFinish() { driver.findElement(By.xpath(BtnFinish)).click(); }
}
