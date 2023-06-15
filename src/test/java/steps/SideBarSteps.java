package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class SideBarSteps extends BaseSteps{
    @And("^(?:I )*click on burger menu$")
    public void clickOnBurgerMenu() {
        sideBar.burgerMenu.shouldBe(visible).click();
    }

    @When("^I follow the Logout link$")
    public void iFollowTheLogoutLink() {
        sideBar.logoutLink.shouldBe(visible).click();
    }
}
