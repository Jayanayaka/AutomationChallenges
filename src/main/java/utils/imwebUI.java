package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class imwebUI {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    public imwebUI() {

    }

    public imwebUI(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver webdriver) {
        driver = webdriver;
    }

    public static void setWait(WebDriverWait waitdriver) {
        wait = waitdriver;
    }
}
