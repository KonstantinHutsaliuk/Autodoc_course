package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.fail;

public class TestIsExistInDom extends WebDriverInit {
    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        List<WebElement> logo = driver.findElements(By.xpath("//a[@class='header__logo']"));
        if (logo.size() > 0){
            System.out.println("Logo appeared");
        }else {
            fail("Logo didn't appear");
        }
    }
}
