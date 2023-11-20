package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebDriverInit {
    public WebDriver driver;
    public WebDriverWait webDriverWait;

    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //отключает уведомления в браузере
        //options.addArguments("--disable-notifications");

        //отключает блокировку всплывающих окон
        //options.addArguments("--disable-popup-blocking");

        //отключает инфобары хрома
       // options.addArguments("--disable-infobars");

        //предотвращает обнаружение автоматизированного средства веб-тестирования
        //options.addArguments("--disable-blink-features=AutomationControlled");

        //запускает браузер в режиме графического интерфейса(headless mode)
        //options.addArguments("--headless");

        //запускает на полный экран
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterTest
    public void after(){
        driver.quit();
    }

}
