package hw26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRozetkaFilters extends WebDriverInit {
    @Test
    public void testRozetkaFilters() {
        driver.get("https://rozetka.com.ua/");
        changeCFCookie("THb.hORIB2vuc0cWuMO0jJX8o4odbeFBnLRRDwi6wR8-1701120120-0-1-b8a9ede5.92fab93a.efa8b205-0.2.1701120120");

        laptopAndCompCategory();
        laptopsSubCategory();
        checkBoxRozetka();
        setMaxPrice("100000");
        firstPromotionItem();

        Assert.assertTrue(plugPromotion().isDisplayed(), "No plug on the page");
    }

    public void laptopAndCompCategory() {
        WebElement laptopAndCompCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//ul[contains(@class, 'menu-categories_type_main')]/li[1]/a")));
        laptopAndCompCategory.click();
    }

    public void laptopsSubCategory() {
        WebElement laptopsSubCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "(//a[contains(@href, 'c80004/')])[1]")));
        laptopsSubCategory.click();
    }

    public void checkBoxRozetka() {
        WebElement checkBoxRozetka = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-id='Rozetka']")));
        checkBoxRozetka.click();
    }

    public void setMaxPrice(String price) {
        WebElement maxPrice = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//fieldset/div/input[2]")));
        maxPrice.clear();
        maxPrice.sendKeys(price);

        WebElement okButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                (By.xpath("//fieldset/div/button"))));
        okButton.click();
    }

    public void firstPromotionItem() {
        WebElement firstPromotionItem = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(@class, 'promo-label_type_action')])[1]/parent::div")));
        jsExecutor(driver, "arguments[0].scrollIntoView();", firstPromotionItem);
        firstPromotionItem.click();
    }

    public WebElement plugPromotion(){
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//div[@class='product-about']//rz-label)[2]")));
    }
}
