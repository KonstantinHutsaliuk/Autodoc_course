package lesson29;

import init.InitialSelenide;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;

public class SelenidePageObjectTest extends InitialSelenide {

    @Test
    public void testSelenidePO(){
        new MainPageLogic().checkCategoriesQuantity(16).clickOnCategory(0).clickOnSubcategoryLaptops()
                .checkQuantityOfGoodsTitles(60);
    }

}
