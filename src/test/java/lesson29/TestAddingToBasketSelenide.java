package lesson29;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestAddingToBasketSelenide {
    private SoftAssert softAssert = new SoftAssert();
    final String EXPECTED_PRODUCT = "1";

    @Test
    public void testAddingToBasket(){
        open("https://rozetka.com.ua/");
        $(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]")).click();
        $(byXpath("(//a[contains(@href, 'c80004/')])[1]")).click();
        $(byXpath("(//span[@class='goods-tile__title'])[1]")).shouldBe(Condition.visible, Duration.ofSeconds(5));
        SelenideElement titleOfFirstProduct = $(byXpath("//a[@class='cart-product--title']"));
        String textOfTitleOfFirstProduct = titleOfFirstProduct.innerText();

        SelenideElement basketCounter = $(byXpath("//span[contains(@class, 'badge badge')]"));
        String numFromBasketCounter = basketCounter.attr("innerText");
        softAssert.assertEquals(numFromBasketCounter, EXPECTED_PRODUCT);
        basketCounter.click();

        String textOfTitleInBasket = $(byXpath("//a[@class='cart-product--title']")).attr("innerText");
        softAssert.assertEquals(textOfTitleInBasket, textOfTitleOfFirstProduct);
        softAssert.assertAll();


    }
}
