package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    public SelenideElement basket = $(byId("shopping_cart_container"));

    public SelenideElement checkout = $(byId("checkout"));

    public SelenideElement firstNameField = $(byId("first-name"));

    public SelenideElement lastNameField = $(byId("last-name"));

    public SelenideElement postalCodeField = $(byId("postal-code"));

    public SelenideElement continueButton = $(byId("continue"));

    public SelenideElement finishButton = $(byId("finish"));

    public SelenideElement thankYouForYourOrderText = $(byTagName("h2"));

}
