package pages;

import org.openqa.selenium.By;
import utils.imwebUI;


public class advertisementPage {
    String TxtModel = "//td[contains(text(),'Swift')]";
    String TxtManufacture = "//td[contains(text(),'Suzuki')]";
    String TxtTransmission = "//td[contains(text(),'Manual')]";
    String TxtManufactureYear = "//td[contains(text(),'2011')]";


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
