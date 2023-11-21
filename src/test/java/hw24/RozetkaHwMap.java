package hw24;

import init.WebDriverInit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RozetkaHwMap extends WebDriverInit {
    @Test
    public void findElements() throws IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopAndCompCategory = driver.findElement(By.xpath(
                "//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopAndCompCategory.click();
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "(//a[contains(@href, 'c80004/')])[1]")));
        subCategory.click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='criteo-syncframe-onetag']")));
        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class = 'goods-tile__title']"));
        List<WebElement> listOfPrices = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        Map<String, String> titlesAndPrices = new LinkedHashMap<>();
        for (int i = 0; i < listOfPrices.size(); i++) {
            titlesAndPrices.put(listOfTitles.get(i).getText(), StringUtils.chop(listOfPrices.get(i).getText()));
        }

        FileWriter fileWriter = new FileWriter("rozetkaTest.txt");
        for (Map.Entry<String, String> entry : titlesAndPrices.entrySet()) {
            fileWriter.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        fileWriter.close();
    }
}
