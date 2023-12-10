package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPageLocators {
    ElementsCollection titlesOfAllProducts = $$(byXpath("//span[@class='goods-tile__title']"));

}
