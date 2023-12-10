package hw29;

import init.InitialSelenide;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class TestCheckTitleOfAddedItemSelenide extends InitialSelenide {
    @Test
    public void checkTitleOfAddedItem(){
        open("https://rozetka.com.ua/");
        changeCFCookie();
        new MainPageLogic().checkCategoriesQuantity(17).clickOnCategory(1).clickOnSubcategoryLaptops()
                .checkQuantityOfGoodsTitles(60).addItemToCartByIndex(1)
                .checkCartCount("1").checkProductInCart(1);
    }
}
