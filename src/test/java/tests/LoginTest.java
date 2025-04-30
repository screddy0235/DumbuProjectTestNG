package tests;

import base.BasePage;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest extends BasePage {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("santosh", "Pipra");
    }
}
