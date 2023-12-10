package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public interface IPopupCart {
    SelenideElement product = $(byXpath("//a[@class='cart-product__title']"));

    default void checkMatchingTitleOfProductI(String expectedTitle) {
        String titleOfAddedItem = product.shouldBe(Condition.visible, Duration.ofSeconds(5)).text();
        Assert.assertEquals(titleOfAddedItem, expectedTitle);
    }
}
