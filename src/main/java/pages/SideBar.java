package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;


public class SideBar {

    public SelenideElement burgerMenu = $(byId("react-burger-menu-btn"));

    public SelenideElement logoutLink = $(byId("logout_sidebar_link"));
}
