package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPageLocators {
    ElementsCollection sideBarCategories = $$(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li"));
}
