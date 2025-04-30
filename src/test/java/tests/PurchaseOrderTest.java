package tests;

import base.BasePage;
import org.testng.annotations.*;
import pages.DashBoardPage;
import pages.LoginPage;


public class PurchaseOrderTest extends BasePage {


    @Test
    public void ordering() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("santosh", "Pipra");
        DashBoardPage orderType = new DashBoardPage(driver);
        orderType.order("Purchase Order", "2");

    }

}