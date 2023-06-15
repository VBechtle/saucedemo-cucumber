package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import steps.BaseSteps;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps {
    @Given("^I open the page Login$")
    public void iOpenPageLogin() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue) {
        loginPage.usernameField.setValue(usernameValue);
    }

    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue){
        loginPage.passwordField.setValue(passwordValue);
    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^error with text \"([^\"]*)\" is displayed$")
    public void errorWithTextIsDisplayed(String expectedText) {
        loginPage.errorMessage.shouldBe(visible);
        loginPage.errorMessage.shouldHave(text(expectedText));
    }

    @Then("^I am on the page Login$")
    public void iAmOnThePageLogin() {
        loginPage.loginButton.shouldBe(visible);
    }
}
