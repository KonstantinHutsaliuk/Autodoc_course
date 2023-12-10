package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class SearchPageLogic extends SearchPageLocators {
    public SearchPageLogic checkQuantityOfGoodsTitles(int titleAmount) {
        titlesOfAllProducts.shouldBe(CollectionCondition.size(titleAmount), Duration.ofSeconds(10));
        return this;
    }
}
