package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestBase {
    public static WebDriver driver;

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.bausparen.at/de/bausparen.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
        element.click();

    }

    public void closeDriver() throws IOException {

        if (null != driver) {

            driver.quit();
        }

    }
}
