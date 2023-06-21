package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static java.lang.Double.parseDouble;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InventorySteps extends BaseSteps {

    @Then("^I am on the Inventory$")
    public void iAmOnTheInventory() {
    inventoryPage.inventoryList.shouldBe(visible);
    }

    @When("^I push Add to cart button of backpack$")
    public void iPushAddToCartButtonOfBackpack() {
        inventoryPage.addToCart.click();
    }

    @Then("^inventory item quantity is (\\d+)$")
    public void inventoryItemQuantityIs(int expectedItemQuantity) {
        inventoryPage.inventoryItems.filterBy(visible).shouldHave(CollectionCondition.size(expectedItemQuantity));

    }

    @Then("^all items name are sorted alphabetically$")
    public void allItemsNameAreSortedAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName: inventoryPage.itemNames) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        assertEquals(expectedNames, actualNames);
    }

    @When("^I choose sorting option by name A-Z$")
    public void iChooseSortingOptionByNameAZ() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionAZ.shouldBe(visible).click();
    }

    @When("^I choose sorting option by name Z-A$")
    public void iChooseSortingOptionByNameZA() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionZA.shouldBe(visible).click();
    }

    @Then("^all items name are sorted in reverse alphabetically order$")
    public void allItemsNameAreSortedInReverseAlphabeticalOrder() {
        List<String> expectedNames = new ArrayList<>();
        for (SelenideElement itemName: inventoryPage.itemNames) {
            expectedNames.add(itemName.getText());
        }
        sort(expectedNames, reverseOrder());
        inventoryPage.itemNames.shouldHave(exactTexts(expectedNames));

    }

    @When("^I choose sorting option by price low to high$")
    public void iChooseSortingOptionByPriceLowToHigh() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionLowToHigh.shouldBe(visible).click();
    }

    @When("^I choose sorting option by price high to low$")
    public void iChooseSortingOptionByPriceHighToLow() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionHighToLow.shouldBe(visible).click();
    }


    @Then("^all items are sorted by price ascending$")
    public void allItemsAreSortedByPriceAscending() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice: inventoryPage.itemPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
//            actualPrices.add(parseDouble(itemPrice.getText().replaceAll("[^0-9.]","")));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices);
        assertEquals(expectedPrices, actualPrices);
    }

    @Then("^all items are sorted by price descending$")
    public void allItemsAreSortedByPriceDescending() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice: inventoryPage.itemPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices, reverseOrder());
        assertEquals(expectedPrices, actualPrices);
    }
//    public void allPricesAreSortedFromLowToHigh() {
//        List<Double> actualPrices = new ArrayList<>();
//        for (SelenideElement itemPrice: inventoryPage.itemPrices) {
//            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
//        }
//        List<Double> expectedPrices = new ArrayList<>(actualPrices);
//        sort(expectedPrices);
//        List <String> expectedPricesText = new ArrayList<>();
//        for (Double value:expectedPrices) {
//            expectedPricesText.add(value.toString());
//        }
//        inventoryPage.itemPrices.shouldHave(texts(expectedPricesText));
//    }
}
