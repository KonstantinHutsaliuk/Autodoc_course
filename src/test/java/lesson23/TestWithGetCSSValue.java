package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestWithGetCSSValue extends WebDriverInit {
    final String EXPECTED_COLOR = "rgba(0, 160, 70, 1)";
    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchButton = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement titleOfFirstProduct = driver.findElement(By.xpath("(//span[@class='goods-tile__title'])[1]"));
        titleOfFirstProduct.click();

        WebElement inStockLabel = driver.findElement(By.xpath("//p[contains(@class, 'status-label--green')]"));
        String colorOfInStockLabel = inStockLabel.getCssValue("color");
        System.out.println(colorOfInStockLabel);
        Assert.assertEquals(colorOfInStockLabel, EXPECTED_COLOR);
    }
}