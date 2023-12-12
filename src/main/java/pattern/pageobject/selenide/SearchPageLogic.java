package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import pattern.pageobject.selenium.LaptopSubcategoryPage;

import java.time.Duration;

public class SearchPageLogic extends SearchPageLocators implements IHeader, IPopupCart{
    public SearchPageLogic checkQuantityOfGoodsTitles(int titleAmount) {
        titlesOfAllProducts.shouldBe(CollectionCondition.size(titleAmount), Duration.ofSeconds(10));
        return this;
    }

    public SearchPageLogic addItemToCartByIndex(int buyButtonIndex) {
        buyBtnByIndex.get(buyButtonIndex - 1).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    private String getNameOfItemByIndex(int indexOfItem) {
        return titlesOfAllProducts.get(indexOfItem - 1).text();
    }

    public SearchPageLogic checkCartCount(String expectedString) {
        checkCartCounterI(expectedString);
        return this;
    }

    public SearchPageLogic checkProductInCart(int numberOfProductInListing) {
        String titleInListing = getNameOfItemByIndex(numberOfProductInListing);
        openCartPopUpI();
        checkMatchingTitleOfProductI(titleInListing);
        return this;
    }
}
