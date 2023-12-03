package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaptopAndCompCategoryPage extends LaptopAndCompCategoryPageLocators {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopAndCompCategoryPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LaptopSubcategoryPage openLaptopSubcategoryLink() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopLink)).click();
        return new LaptopSubcategoryPage(driver);
    }
}
