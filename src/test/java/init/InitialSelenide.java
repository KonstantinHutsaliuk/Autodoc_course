package init;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class InitialSelenide {
    private final String CF_COOKIE =
            "R76LAmDGlqZN1qkCUsdnZaYaM0qfmvbtKVEQfkmv7v0-1702219342-0-1-e89b0d3b.2770ddd2.bf9a52db-0.2.1702219342";

    @BeforeTest
    public void before() {
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-agent=some user agent");
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        //Configuration.browserCapabilities = options;

    }

    public void changeCFCookie() {
        Cookie cookie = new Cookie("cf_clearance", CF_COOKIE);
        getWebDriver().manage().deleteCookieNamed("cf_clearance");
        getWebDriver().manage().addCookie(cookie);
        getWebDriver().navigate().refresh();
    }
}

