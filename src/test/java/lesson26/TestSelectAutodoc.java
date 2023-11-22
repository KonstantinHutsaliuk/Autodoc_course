package lesson26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelectAutodoc extends WebDriverInit {

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        driver.manage().deleteAllCookies();
        //тут нужен метода закрытия поп-апа

        getMarkByValue(driver, "25");

    }

    public void getMarkByValue(WebDriver driverFromTest, String markValue) throws InterruptedException {
        WebElement makerList = driverFromTest.findElement(By.id("form_maker_id"));

        String markOptionValue =
                String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value='%s']", markValue);

        makerList.click();
        driverFromTest.findElement(By.xpath(markOptionValue)).click();

        sleep(5000);
    }
}
