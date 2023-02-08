package utils;

import functions.Home;
//import functions.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;


public class TestBase {
    @BeforeSuite
    public void setUpPrerequisites() throws IOException {

    }


    @BeforeMethod
    public void initBaseClass() throws Exception {
        Home.loadHomePage("Pat_Pat");
//        Assert.assertEquals(Home.getActTitle(), Home.getExpTitle());
//        Assert.assertEquals(Home.actualTitle(), Home.expectedTitle());


    }

//    @AfterMethod
//    public void quit() {
//        Login.quitDriver();
//    }

}
