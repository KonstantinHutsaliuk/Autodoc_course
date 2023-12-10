package pattern.pageobject.selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPageLocators {
    SelenideElement laptopSubcategory = $(byXpath("(//a[contains(@href, 'c80004/')])[1]"));

}
