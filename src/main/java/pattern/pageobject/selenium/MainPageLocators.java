package pattern.pageobject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {
    By inputSearch = By.name("search");
    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");
    By laptopAndCompLink = By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]/a");
}
