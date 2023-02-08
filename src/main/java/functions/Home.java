package functions;

import common.Constant;
import pages.CarPage;
import pages.HomePage;

public class Home {

    public static HomePage homePage = new HomePage();


    public static void loadHomePage(String login) throws Exception {
        homePage.loadHomePage(Constant.baseUrl, login);
    }

    public static void navigateToVehicle() {
        homePage.navigateToVehicle();
    }

    public static void navigateToCar() {
        homePage.navigateToCar();
    }



}
