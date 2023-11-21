package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJSAlertExample extends WebDriverInit {


    @Test
    public void testAllert() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Are eou sure')");
        TimeUnit.SECONDS.sleep(3);

        driver.switchTo().alert().accept();
        TimeUnit.SECONDS.sleep(3);
    }
}
