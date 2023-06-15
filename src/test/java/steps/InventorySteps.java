package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class InventorySteps extends BaseSteps {

    @Then("^I am on the Inventory$")
    public void iAmOnTheInventory() {
    inventoryPage.inventoryList.shouldBe(visible);
    }

    @When("^I push Add to cart button of backpack$")
    public void iPushAddToCartButtonOfBackpack() {
        inventoryPage.addToCart.click();
    }
}
