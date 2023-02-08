package utils;

import common.Constant;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverUtil {


    public static WebDriver getChromeDriver(String url) {

        WebDriver driver = null;
        ChromeOptions options = null;

        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", Constant.webDriverPath);

        options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.javascript", 1);


        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
//        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//        options.addArguments("--headless");


        driver= new ChromeDriver(options);
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1900, 1100));
        driver.get(url);


        return driver;

    }

//    public static WebDriver getChromeDriverForDownload(String url) throws IOException {
//
//
//        String downloadFilepath = Constant.DownloadPath;
//        System.out.println(downloadFilepath);
//
//        System.out.println("launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", Constant.webDriverPath);
//
//        HashMap<String, Object> chromePreferences = new HashMap<String, Object>();
//        chromePreferences.put("profile.default_content_settings.popups", 0);
//        chromePreferences.put("download.prompt_for_download", "false");
//        chromePreferences.put("download.default_directory", downloadFilepath);
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        chromeOptions.setExperimentalOption("prefs", chromePreferences);
//        chromeOptions.addArguments("start-maximized");
//        chromeOptions.addArguments("disable-infobars");
//
//
//        //HEADLESS CHROME
////        chromeOptions.addArguments("headless");
//
//        chromeOptions.setExperimentalOption("prefs", chromePreferences);
//        DesiredCapabilities cap = DesiredCapabilities;
//        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//
//        ChromeDriverService driverService = ChromeDriverService.createDefaultService();
//        ChromeDriver driver = new ChromeDriver(driverService, chromeOptions);
//
//        Map<String, Object> commandParams = new HashMap<>();
//        commandParams.put("cmd", "Page.setDownloadBehavior");
//        Map<String, String> params = new HashMap<>();
//        params.put("behavior", "allow");
//        params.put("downloadPath", downloadFilepath);
//        commandParams.put("params", params);
//        ObjectMapper objectMapper = new ObjectMapper();
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        String command = objectMapper.writeValueAsString(commandParams);
//        String u = driverService.getUrl().toString() + "/session/" + driver.getSessionId() + "/chromium/send_command";
//        HttpPost request = new HttpPost(u);
//        request.addHeader("content-type", "application/json");
//        request.setEntity(new StringEntity(command));
//        try {
//            httpClient.execute(request);
//        } catch (IOException e2) {
//
//            e2.printStackTrace();
//        }
//        driver.get(url);
//
//
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        driver.manage().window().setSize(new Dimension(1900, 1100));
//
//
//
//        return driver;
//        }



    }



