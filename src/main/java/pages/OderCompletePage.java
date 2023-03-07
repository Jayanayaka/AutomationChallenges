package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.imwebUI;

public class OderCompletePage {

    private String OderCompleteSuccessMsg = "//h2[contains(text(),'Thank you for your order!')]";

    public String verifyOderCompleteSuccessMsg() throws InterruptedException {
        imwebUI.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OderCompleteSuccessMsg)));
        String error = imwebUI.driver.findElement(By.xpath(OderCompleteSuccessMsg)).getText();
        return error;
    }


}
