package hw23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RozetkaFirstTest extends WebDriverInit {
    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement desktopAndLaptopLink = driver.findElement(By.xpath(
                "//ul[contains(@class, 'menu-categories_type_main')]/li[1]/a"));
        desktopAndLaptopLink.click();

        WebElement laptopLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//a[@title='Ноутбуки'][1]")));
        laptopLink.click();

        WebElement firstElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//ul[@rzgridlayout]/li[1]//span[@class='goods-tile__title']")));
        String titleOfFirstElement = firstElement.getText();

        WebElement firstBuyButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//ul[@rzgridlayout]/li[1]//app-buy-button")));
        firstBuyButton.click();

        WebElement basketIconBadge = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//rz-icon-badge/span")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(basketIconBadge.getText(), "1");

        WebElement basketIcon = driver.findElement(By.xpath("//rz-icon-badge/.."));
        basketIcon.click();

        WebElement basketProductTitle = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//a[@class='cart-product__title']")));

        Assert.assertEquals(basketProductTitle.getText(), titleOfFirstElement);
        softAssert.assertAll();
    }
}
