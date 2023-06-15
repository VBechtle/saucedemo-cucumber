package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BasketSteps extends BaseSteps{

    @Then("^I push on the basket icon$")
    public void iPushOnTheBasketIcon() {
        basketPage.basket.click();
    }

    @And("^I push Checkout button$")
    public void iPushCheckoutButton() {
        basketPage.checkout.click();
    }

    @Then("^I input \"([^\"]*)\" to First Name field$")
    public void iInputToFirstNameField(String firstNameValue) {
        basketPage.firstNameField.setValue(firstNameValue);
    }

    @Then("^I input \"([^\"]*)\" to Last Name field$")
    public void iInputToLastNameField(String lastNameValue) {
        basketPage.lastNameField.setValue(lastNameValue);
    }


    @Then("^I input \"([^\"]*)\" to ZIP/Postal Code field$")
    public void iInputToZIPPostalCodeField(String postalCodeValue) {
        basketPage.postalCodeField.setValue(postalCodeValue);
    }


    @And("^I push Continue button$")
    public void iPushContinueButton() {
        basketPage.continueButton.click();
    }

    @Then("^I push Finish button on the Checkout: Overview page$")
    public void iPushFinishButtonOnTheCheckoutOverviewPage() {
        basketPage.finishButton.click();
    }

    @And("^I check text \"([^\"]*)\"$")
    public void iCheckText(String expectedText) {
        basketPage.thankYouForYourOrderText.shouldBe(Condition.visible);
        basketPage.thankYouForYourOrderText.shouldHave(Condition.text(expectedText));

    }

    @And("^I check that URL contains \"([^\"]*)\"$")
    public void iCheckThatURLContains(String expectedPartLink){
        Assert.assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains(expectedPartLink));
    }
}
