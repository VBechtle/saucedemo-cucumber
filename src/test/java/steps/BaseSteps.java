package steps;

import pages.InventoryPage;
import pages.LoginPage;

public class BaseSteps {

    public String BASE_URL="https://www.saucedemo.com/";
    public LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

}
