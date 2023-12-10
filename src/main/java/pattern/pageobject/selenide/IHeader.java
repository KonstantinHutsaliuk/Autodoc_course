package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;

public interface IHeader {
    SelenideElement counter = $(byXpath("//rz-icon-badge/span"));
    SelenideElement icon = $(byXpath("//button[@rzopencart]"));

    default void checkCartCounterI(String expectedString) {
        String cartCounter = counter.shouldBe(Condition.visible, Duration.ofSeconds(5)).text();
        Assert.assertEquals(cartCounter, expectedString);
    }

    default void openCartPopUpI() {
        icon.click();
    }
}
