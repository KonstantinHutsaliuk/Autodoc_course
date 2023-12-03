package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LaptopSubcategoryPage extends LaptopSubcategoryPageLocators implements IHeader, IPopupCart {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopSubcategoryPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LaptopSubcategoryPage addItemToCartByIndex(int buyButtonIndex) {
        List<WebElement> buyButtons = driver.findElements(addToCartButtons);
        buyButtons.get(buyButtonIndex - 1).click();
        return this;
    }

    private String getNameOfItemByIndex(int indexOfItem) {
        return driver.findElements(productTitles).get(indexOfItem).getText();
    }

    public LaptopSubcategoryPage checkCartCount(String expectedString) {
        checkCartCounterI(webDriverWait, expectedString);
        return this;
    }

    public LaptopSubcategoryPage checkProductInCart(int numberOfProductInListing) {
        String titleInListing = getNameOfItemByIndex(numberOfProductInListing - 1);
        openCartPopUp(webDriverWait);
        checkMatchingTitleOfProductI(webDriverWait, titleInListing);
        return this;
    }
}
