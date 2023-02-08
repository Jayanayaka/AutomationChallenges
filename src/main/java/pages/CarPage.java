
package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.CommonUtil;
import utils.imwebUI;

import static utils.imwebUI.driver;

public class CarPage{
    public String TxtSearchBox = "//header/div[1]/section[1]/div[3]/form[1]/div[1]/input[1]";
    private String TxtModelYear = "//body/div[@id='app']/div[2]/div[3]/section[3]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/input[1]";
    private String ManufacturerField = "//body[1]/div[1]/div[2]/div[3]/section[3]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/label[1]";
    private String VehicleTypeFeild = "//label[contains(text(),'Vehicle Type')]";
    private String ModelTypeField = "//body[1]/div[1]/div[2]/div[3]/section[3]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/label[1]";
    private String TransmissionField = "//body[1]/div[1]/div[2]/div[3]/section[3]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/label[1]";
    private String DropDownManufacturer = "//select[@id='manufacturer']";
    private String DropDownVehicleType = "//select[@id='type']";
    private String DropDownModel = "//select[@id='model']";
    private String DropDownTransmission = "//select[@id='transmission']";
    private String BtnSearch = "//input[@id='search-btn']";
    private String BtnCarName = "//body/div[@id='app']/div[2]/div[3]/section[3]/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]";
    private String BtnFilter = "//body/div[@id='app']/div[2]/div[3]/section[3]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]";
    String manufacturer;
    String model;
    String transmission;
    String VehicleType;

    String Year;
    public void enterSearchVehicleType(String SearchName) {

        driver.findElement(By.xpath(TxtSearchBox)).sendKeys(SearchName);

    }
    public void clickSearch() { driver.findElement(By.xpath(BtnSearch)).click(); }
    public void addVehicleType(String VehicleType) throws InterruptedException {
        CommonUtil.scrollToElement(driver, VehicleTypeFeild);
        Select dropdownVehicleType = new Select(driver.findElement(By.xpath(DropDownVehicleType)));
        dropdownVehicleType.selectByVisibleText(VehicleType);
        this.VehicleType = VehicleType;

    }
    public void addManufacturer(String manufacturer) throws InterruptedException {
        CommonUtil.scrollToElement(driver, ManufacturerField);
        Select dropdownManufacturer = new Select(driver.findElement(By.xpath(DropDownManufacturer)));
        dropdownManufacturer.selectByVisibleText(manufacturer);
        this.manufacturer = manufacturer;
    }
    public void addModel(String model) throws InterruptedException {
        CommonUtil.scrollToElement(driver, ModelTypeField);
        Select dropdownModel = new Select(driver.findElement(By.xpath(DropDownModel)));
        Thread.sleep(3000);
        dropdownModel.selectByVisibleText(model);

        this.model = model;

    }
    public void addTransmission(String transmission) throws InterruptedException {
        CommonUtil.scrollToElement(driver, TransmissionField);
        Select dropdownTransmission = new Select(driver.findElement(By.xpath(DropDownTransmission)));
        dropdownTransmission.selectByVisibleText(transmission);
        this.transmission = transmission;

    }
    public void getTxtModelYear(String Year){
        imwebUI.driver.findElement(By.xpath(TxtModelYear)).sendKeys(Year);
        this.Year = Year;
    }
    public void clickFilter() { driver.findElement(By.xpath(BtnFilter)).click(); }
    public WebDriver navigateToAdvertisement(){

        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BtnCarName)));
        driver.findElement(By.xpath(BtnCarName)).click();
        return driver;

    }

    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){return model;}
    public String getTransmission(){
        return transmission;
    }
    public String getManufactureYear(){
        return Year;
    }
}
