package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

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

    @Step(value = "This method does something with name {name}")
    public MainPageLogic someMethod(String name){
        System.out.println("do something with name" + name);
        return this;
    }

    @Step(value = "This method opens url {url}")
    public MainPageLogic open(String url){
        System.out.println("open url" + url);
        return this;
    }
}
