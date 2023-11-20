package lesson24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFindElements extends WebDriverInit {

    @Test
    public void findElements() {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopAndCompCategory = driver.findElement(By.xpath(
                "//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopAndCompCategory.click();
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "(//a[contains(@href, 'c80004/')])[1]")));
        subCategory.click();
        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class='goods-tile__title']"));
        for (WebElement element : listOfTitles) {
            String titleText = element.getText();
            System.out.println(titleText);
        }
        Assert.assertEquals(listOfTitles.size(), 60, "Elements size on page doesn't equals 60");

    }

}
