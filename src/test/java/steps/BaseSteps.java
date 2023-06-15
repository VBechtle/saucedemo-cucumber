package steps;

import pages.BasketPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.SideBar;

public class BaseSteps {

    static String BASE_URL="https://www.saucedemo.com/";
    public LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    SideBar sideBar = new SideBar();

    BasketPage basketPage = new BasketPage();

}
