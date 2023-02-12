package pages;

import org.openqa.selenium.By;
import utils.imwebUI;


public class advertisementPage {
    String TxtModel = "//table[@class='course-info table table-striped']/tbody/tr[6]/td[2]";
    String TxtManufacture = "//table[@class='course-info table table-striped']/tbody/tr[5]/td[2]";
    String TxtTransmission = "//table[@class='course-info table table-striped']/tbody/tr[4]/td[2]";
    String TxtManufactureYear = "//table[@class='course-info table table-striped']/tbody/tr[2]/td[2]";


    public String getManufacture(){
        return imwebUI.driver.findElement(By.xpath(TxtManufacture)).getText();
    }
    public String getModel(){
        return imwebUI.driver.findElement(By.xpath(TxtModel)).getText();
    }
    public String getTransmission(){
        return imwebUI.driver.findElement(By.xpath(TxtTransmission)).getText();
    }
    public String getManufactureYear(){
        return imwebUI.driver.findElement(By.xpath(TxtManufactureYear)).getText();
    }

}
