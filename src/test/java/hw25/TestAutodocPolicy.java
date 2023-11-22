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

public class TestAutodocPolicy extends WebDriverInit {
    @Test
    public void privacyPolicyAutodoc() {
        driver.get("https://www.autodoc.co.uk/");
        closePopupCookies();
        loginButtonClick();
        registerButtonClick();
        privacyButtonClick();
        switchTab();
        socialNetworkBlockFind();

        WebElement socialNetworksBlock = driver.findElement(By.xpath("(//h2/b)[3]"));
        WebElement textInSocialBlock = driver.findElement(By.xpath("(//h2)[3]/following-sibling::p"));

        Assert.assertTrue(socialNetworksBlock.isDisplayed());
        Assert.assertTrue(textInSocialBlock.getText().contains("We maintain online"));
        Assert.assertEquals(driver.getTitle(), "Privacy Policy");
    }

    public void closePopupCookies() {
        WebElement cookiesBanner = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//a[@id='3']")));
        jsExecutor(driver,"arguments[0].click();", cookiesBanner);
    }

    public void loginButtonClick() {
        WebElement logInButton = driver.findElement(By.xpath("//a[contains(@class, 'js-show-login-popup')]"));
        logInButton.click();
    }

    public void registerButtonClick() {
        WebElement registerButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//a[@class= 'show_register_popup']")));
        registerButton.click();
    }

    public void privacyButtonClick() {
        WebElement registerButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//label[@id='privacy_policy_header_modal']/a")));
        registerButton.click();
    }

    public void switchTab() {
        Set<String> handless = driver.getWindowHandles();
        List<String> listHandless = new ArrayList<>(handless);
        driver.switchTo().window(listHandless.get(1));
    }

    public void socialNetworkBlockFind(){
        WebElement socialNetworksBlock = driver.findElement(By.xpath("(//h2/b)[3]"));
        jsExecutor(driver, "arguments[0].scrollIntoView();", socialNetworksBlock);
    }
}
