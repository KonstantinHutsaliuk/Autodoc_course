package hw25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestRozetkaPolicy extends WebDriverInit {
    @Test
    public void privacyPolicyRozetka() {

        driver.get("https://rozetka.com.ua/");
        changeCFCookie("uFgDyROa_F8TMBXdYa2JfR.yfqCMIuh9D4OeVfZuNNU-1700661505-0-1-6bc3b921.1a79055a.3cc2e6c1-0.2.1700661505");

        loginPopupOpen();
        regButtonClick();
        policyButtonClick();

        Set<String> handless = driver.getWindowHandles();
        List<String> listHandless = new ArrayList<>(handless);
        driver.switchTo().window(listHandless.get(1));

        changeCFCookie("uFgDyROa_F8TMBXdYa2JfR.yfqCMIuh9D4OeVfZuNNU-1700661505-0-1-6bc3b921.1a79055a.3cc2e6c1-0.2.1700661505");

        changeLang();
        changeCFCookie("uFgDyROa_F8TMBXdYa2JfR.yfqCMIuh9D4OeVfZuNNU-1700661505-0-1-6bc3b921.1a79055a.3cc2e6c1-0.2.1700661505");

        WebElement deleteBlock = driver.findElement(By.xpath("(//h3/strong)[5]"));
        jsExecutor(driver, "arguments[0].scrollIntoView();", deleteBlock);

        WebElement textInDeleteBlock = driver.findElement(By.xpath("(//h3)[5]/following-sibling::ul/li"));

        Assert.assertEquals(driver.getTitle(), "Угода користувача | ROZETKA");
        Assert.assertTrue(deleteBlock.isDisplayed());
        Assert.assertTrue(textInDeleteBlock.getText().contains("Войдите в личный кабинет,"));
    }

    public void loginPopupOpen() {
        WebElement loginButton = driver.findElement(By.xpath(
                "(//button[contains(@class, 'header__button')])[2]"));
        loginButton.click();
    }

    public void regButtonClick() {
        WebElement regButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class, 'auth-modal__register-link ')]")));
        regButton.click();
    }

    public void policyButtonClick() {
        WebElement policy = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "(//p[@class='form__caption'])[2]/a[2]")));
        policy.click();
    }

    public void changeLang() {
        WebElement ruLang = driver.findElement(By.xpath("(//li[contains(@class, 'lang__item')])[1]"));
        ruLang.click();
    }
}
