package lesson24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestWithSubmit extends WebDriverInit {
    @Test
    public void testSubmit() throws InterruptedException {
        driver.get("https://google.com.ua");
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement btnSearch = driver.findElement(By.className("gNO89b"));
        if (btnSearch.getAttribute("value").equals("Поиск в Google")) {
            inputSearch.sendKeys("qa");
            btnSearch.submit();
        } else {
            Assert.fail();
        }
    }

}
