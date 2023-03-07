package functions;

import pages.HomePage;
import pages.UserDetailsPage;

public class UserDetails {

    public static UserDetailsPage userDetailsPage = new UserDetailsPage();


    public static void enterUserDetails() throws InterruptedException {
        userDetailsPage.typePostalCode("10200");
        userDetailsPage.typeFirstName("nilakshi");
        userDetailsPage.typeLastName("Sewwandi");
        userDetailsPage.clickContinue();

    }


    public static void clickFinish() {
        userDetailsPage.clickFinish();
    }
}
