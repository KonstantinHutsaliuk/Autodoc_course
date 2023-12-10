package lesson29;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import init.WebDriverInit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SelenideCommonMethods extends WebDriverInit {

    @BeforeTest
    public void before(){
        Configuration.browserSize = "1280x720";
    }
    @Test
    public void testCommonMethods(){
        open("https://rozetka.com.ua/");
        SelenideElement btnSearch = $(By.xpath("//button[contains(@class, 'search-form__submit')]"));

        String btnSearchText = btnSearch.text();
        System.out.println(btnSearchText);

        String getAttributeLocalName = btnSearch.attr("LocalName");
        System.out.println(getAttributeLocalName);

        String getCssBackgroundColour = btnSearch.getCssValue("background-color");
        System.out.println(getCssBackgroundColour);

        String currentURL = url();
        System.out.println(currentURL);

        String currentSource = source();
        System.out.println(currentSource);

    }
}
