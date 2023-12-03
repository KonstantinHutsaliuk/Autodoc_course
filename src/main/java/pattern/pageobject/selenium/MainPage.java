package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;

public class MainPage extends MainPageLocators implements IHeader {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopAndCompCategoryPage openLaptopAndCompCategoryLink() {
        driver.findElement(laptopAndCompLink).click();
        return new LaptopAndCompCategoryPage(driver);
    }

    public MainPage typeTextInInputSearch(String text) {
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch() {
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);
    }
}
