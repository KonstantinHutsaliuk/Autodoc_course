package hw27;

import init.WebDriverInit;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;

public class TestCheckTitleOfAddedItem extends WebDriverInit {
    @Test
    public void checkTitleOfAddedItem(){
        driver.get("https://rozetka.com.ua/");
        changeCFCookie();

        new MainPage(driver).openLaptopAndCompCategoryLink().
                openLaptopSubcategoryLink().addItemToCartByIndex(1).
                checkCartCount("1").checkProductInCart( 1);
    }
}
