package functions;

import pages.OderCompletePage;
import pages.UserDetailsPage;

public class OderComplate {

    public static OderCompletePage oderComplatePage = new OderCompletePage();

    public static String getOderCompleteSuccessMsg() throws InterruptedException {
        return oderComplatePage.verifyOderCompleteSuccessMsg();
    }

}
