package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameField = $(byId("user-name"));

    public SelenideElement passwordField = $(byId("password"));

    public SelenideElement loginButton =$(byId("login-button"));

    public SelenideElement errorMessage = $(byTagName("h3"));
}
