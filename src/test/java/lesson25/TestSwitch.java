package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestSwitch extends WebDriverInit {

    @Test
    public void testSwitch() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement loginButton = driver.findElement(By.xpath(
                "(//button[contains(@class, 'header__button')])[2]"));
        loginButton.click();

        TimeUnit.SECONDS.sleep(3);
        WebElement regButton = driver.findElement(By.xpath("//button[contains(@class, 'auth-modal__register-link ')]"));
        regButton.click();

        TimeUnit.SECONDS.sleep(3);
        WebElement policy = driver.findElement(By.xpath("(//p[@class='form__caption'])[2]/a[2]"));
        policy.click();

        TimeUnit.SECONDS.sleep(3);

        Set<String> handless = driver.getWindowHandles();
        List<String> listHandless = new ArrayList<>(handless);

        driver.switchTo().window(listHandless.get(0));
        TimeUnit.SECONDS.sleep(3);

        driver.switchTo().window(listHandless.get(1));
        TimeUnit.SECONDS.sleep(3);

    }
}
