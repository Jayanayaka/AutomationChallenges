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
    private String expectedTitleHomePage = "Home";

    private String actualTitleHomePage = "//a[@class='nav-link Header_active__gnzlZ'][contains(.,'Home')]";

    private String BtnLoginIn = "//header/div[1]/section[1]/div[2]/div[3]/span[1]/a[2]";
    private String BtnVehicle = "//h3[contains(text(),'Vehicles')]";
    private String BtnCar = "//body/div[@id='app']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/*[1]";

    public HomePage(){
    }

    public WebDriver loadHomePage(String url, String login) throws Exception {


        if(login.equals("Pat_Pat")) {

            driver = DriverUtil.getChromeDriver("https://" + Constant.userName + ":" + Constant.Password + "@" + Constant.baseUrl);
//            Thread.sleep(3000);

        }
//
        if(login.equals("imm")){
//            driver = DriverUtil.getChromeDriverForDownload(url);
        }

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnVehicle)));
        imwebUI.setDriver(driver);
        imwebUI.setWait(wait);

        return driver;
    }


    public WebDriver navigateToVehicle() {

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnVehicle)));
        imwebUI.driver.findElement(By.xpath(BtnVehicle)).click();
        return driver;
    }
    public WebDriver navigateToCar(){

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnCar)));
        imwebUI.driver.findElement(By.xpath(BtnCar)).click();
        return driver;

    }


    public String getExpectedTitleHomePage(){
        return expectedTitleHomePage;
    }






}
