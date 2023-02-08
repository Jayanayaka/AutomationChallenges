package tests;

import functions.Car;
import functions.Home;
import functions.advertisement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

import java.io.IOException;

public class CarDetailsPageTest extends TestBase {


    @Test
    public void testVerifyCarDetailsPage () throws IOException, InterruptedException {
        Home.navigateToVehicle();
        Home.navigateToCar();
        Car.typeSearchKeyWordAndSubmit();
        Car.selectCarBySearching();
        Car.navigateToAdvertisement();
        Assert.assertTrue(advertisement.compareExpectedAndActual());


    }
}
