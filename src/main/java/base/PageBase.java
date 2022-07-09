package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    public WebDriver driver;
    WebDriverWait wait;

    public PageBase(WebDriver driver){
        this.driver =  driver;

    }

    public void waitForElement(By e){
        wait = new WebDriverWait(driver,Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(e)));
    }

    public void scroll(By e){
        waitForElement(e);
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        WebElement ele = driver.findElement(e);
        exe.executeScript("arguments[0];", ele );
    }

    public void click (By e){
        waitForElement(e);
        System.out.println(driver);
        driver.findElement(e).click();


    }

    public void addText (By e, String string){
       waitForElement(e);
        driver.findElement(e).sendKeys(string);
    }

    public  String getText(By e){
        waitForElement(e);
        String text = driver.findElement(e).getText();
        return text;
    }




}
