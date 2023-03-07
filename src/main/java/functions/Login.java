package functions;

import common.Constant;
import pages.LoginPage;

public class Login {

    public static LoginPage loginPage = new LoginPage();

    public static void loadLoginPage(String login) throws Exception {
        loginPage.loadLoginPage(Constant.baseUrl, login);
    }

    public static void login(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}
