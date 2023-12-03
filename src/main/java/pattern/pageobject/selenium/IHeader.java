package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public interface IHeader {
    By counter = By.xpath("//rz-icon-badge/span");
    By icon = By.xpath("//button[@rzopencart]");

    default void checkCartCounterI(WebDriverWait webDriverWait, String expectedString) {
        String cartCounter = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(counter)).getText();
        Assert.assertEquals(cartCounter, expectedString);
    }

    default void openCartPopUp(WebDriverWait webDriverWait) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(icon)).click();
    }
}
