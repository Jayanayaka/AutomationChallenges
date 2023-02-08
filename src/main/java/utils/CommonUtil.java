package utils;


import common.Constant;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.*;
import java.util.regex.Pattern;

public class CommonUtil {





    public static String[] suffixes =
            //    0     1     2     3     4     5     6     7     8     9
            {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
                    //    10    11    12    13    14    15    16    17    18    19
                    "th", "th", "th", "th", "th", "th", "th", "th", "th", "th",
                    //    20    21    22    23    24    25    26    27    28    29
                    "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th",
                    //    30    31
                    "th", "st"};
    private static WebDriver driver;






    public static LinkedHashMap<Integer, LinkedHashMap<Integer, String>> getTableContent(WebElement tblObject) {
        try {
            LinkedHashMap<Integer, String> o_clm_data;
            LinkedHashMap<Integer, LinkedHashMap<Integer, String>> tbl_map_result = new LinkedHashMap<Integer, LinkedHashMap<Integer, String>>();


            List<WebElement> list_rows = tblObject.findElements(By.tagName("tr"));
            List<WebElement> list_clms;
            int i_row_count = list_rows.size();
            int i_clm_count;
            for (int i = 0; i < i_row_count; i++) {
                list_clms = list_rows.get(i).findElements(By.tagName("td"));
                i_clm_count = list_clms.size();
                o_clm_data = new LinkedHashMap<Integer, String>();
                for (int j = 0; j < i_clm_count; j++) {

                    o_clm_data.put(j, list_clms.get(j).getText());

                }

                tbl_map_result.put(i, o_clm_data);
            }


            if ((tbl_map_result.get(0).size() > 0) && (tbl_map_result.size() > 0)) {
                System.out.println("info:HTML table fetched and returned in dual hashmap");

            } else {
                System.out.println("Row Count:" + (tbl_map_result.size()) + " Clm Count: " + (tbl_map_result.get(0).size()));

            }

            return tbl_map_result;
        } catch (Exception e) {
            System.out.println("fail:Unable to fetch data from Html table." +
                    " Stack Trace: " + e.getMessage());
            return null;
        }
    }





    public static void scrollToElement(WebDriver driver,String xpath) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath(xpath));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(500);
    }




}