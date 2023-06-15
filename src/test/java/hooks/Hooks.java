package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void setUp(){
//      Configuration.browser = "firefox";
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open("https://www.saucedemo.com/");
        clearBrowserCookies();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
