package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageLocators{
    public MainPageLogic checkCategoriesQuantity(int categories){
        sideBarCategories.shouldHave(CollectionCondition.size(categories));
        return this;
    }

    public CategoryPageLogic clickOnCategory (int categoryNumber){
        sideBarCategories.get(categoryNumber - 1).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return page(CategoryPageLogic.class);

    }
}
