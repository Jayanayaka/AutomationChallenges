package utils;

//import functions.Login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBaseImm {


    @BeforeSuite
    public void setUpPrerequisites() throws IOException {
//        CommonUtil.readTextFromPDFtwo("cards.pdf","cards.txt");
    }


    @BeforeMethod
    public void initBaseClass() throws Exception {
//        Login.loadLoginPage("imm");
//        Assert.assertEquals(Login.actualTitle(), Login.expectedTitle());


    }

//    @AfterMethod
//    public void quit() {
//        Login.quitDriver();
//    }
//}
}
