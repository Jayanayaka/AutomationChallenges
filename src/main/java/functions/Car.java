package functions;

import pages.CarPage;

public class Car {
    public static CarPage carPage = new CarPage();
    public static void typeSearchKeyWordAndSubmit() {
        carPage.enterSearchVehicleType("Used");
        carPage.clickSearch();

    }
    public static void selectCarBySearching() throws InterruptedException {
        carPage.addVehicleType("Cars");
        carPage.addManufacturer("Suzuki");
        carPage.addModel("Swift");
        carPage.getTxtModelYear("2011");
        carPage.addTransmission("Manual");
        carPage.clickFilter();

    }
    public static void navigateToAdvertisement() {
        carPage.navigateToAdvertisement();
    }
}
