package lesson27;

import init.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.facroty.MainPage;


public class FirstPageFactoryTest extends WebDriverInit {
    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    final String URL = "https://rozetka.com.ua/";

    @Test
    public void firstTest(){

        driver.get(URL);
        String actualTittle = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch()
                .clickOnProductTittleByIndex(0)
                .getTitleText();
        Assert.assertEquals(actualTittle, EXPECTED_TITLE);
    }
}
