package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    By titleOfProduct = (By.xpath("//div[@class='product__heading']/h1"));
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return driver.findElement(titleOfProduct).getAttribute("innerText");
    }
}
