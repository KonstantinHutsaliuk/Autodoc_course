package hw25;


import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestRozetkaPolicy extends WebDriverInit {
    @Test
    public void privacyPolicyRozetka() {

        driver.get("https://rozetka.com.ua/");
        changeCFCookie();

        loginPopupOpen();
        regButtonClick();
        policyButtonClick();

        Set<String> handless = driver.getWindowHandles();
        List<String> listHandless = new ArrayList<>(handless);
        driver.switchTo().window(listHandless.get(1));

        changeCFCookie();

        changeLang();
        changeCFCookie();

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
