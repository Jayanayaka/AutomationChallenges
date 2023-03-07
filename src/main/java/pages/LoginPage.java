package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtil;
import utils.imwebUI;

import static utils.imwebUI.driver;

public class LoginPage {
    protected static imwebUI imwebUI = null;
    WebDriver driver;
    WebDriverWait wait;
    private String HomePageTitle = "//h2[@class='m-t-none m-b']";
    private String TxtEmail = "//input[@id='user-name']";
    private String TxtPassword = "//input[@id='password']";
    private String BtnLoginSubmit = "//input[@id='login-button']";

    public void enterUserName(String username) {
        driver.findElement(By.xpath(TxtEmail)).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(TxtPassword)).sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(By.xpath(BtnLoginSubmit)).click();
    }

    public WebDriver loadLoginPage(String url, String login) throws Exception {
        imwebUI = new imwebUI();

        if(login.equals("Swag_Lab")) {
            driver = DriverUtil.getChromeDriver(url);
        }
        if(login.equals("imm")){
//            driver = DriverUtil.getChromeDriverForDownload(url);
        }
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageTitle)));
        imwebUI.setDriver(driver);
        imwebUI.setWait(wait);

        return driver;
    }
}
