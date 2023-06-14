package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.*;

public class InventorySteps extends BaseSteps {

    @Then("^I am on the Inventory$")
    public void iAmOnTheInventory() {
    inventoryPage.inventoryList.shouldBe(visible);
    }
}
