package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public SelenideElement addToCart = $(byId("add-to-cart-sauce-labs-backpack"));

    public ElementsCollection inventoryItems = $$(byClassName("inventory_item"));

    public ElementsCollection itemNames = $$(byClassName("inventory_item_name"));

    public ElementsCollection itemPrices = $$(byClassName("inventory_item_price"));

    public SelenideElement sortDropdown = $(byAttribute("data-test", "product_sort_container"));

    public SelenideElement optionAZ = $("option[value='az']");

    public SelenideElement optionZA = $("option[value='za']");

    public SelenideElement optionLowToHigh = $("option[value='lohi']");
    public SelenideElement optionHighToLow = $("option[value='hilo']");

}




