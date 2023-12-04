package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public interface IPopupCart {
    By product = By.xpath("//a[@class='cart-product__title']");

    default void checkMatchingTitleOfProductI(WebDriverWait webDriverWait, String expectedTitle) {
        String titleOfAddedItem = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(product)).
                getText();
        Assert.assertEquals(titleOfAddedItem, expectedTitle);
    }
}
