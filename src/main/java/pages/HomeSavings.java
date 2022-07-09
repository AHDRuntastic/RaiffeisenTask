package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class HomeSavings extends PageBase {

    public HomeSavings(WebDriver driver) {
        super(driver);

    }

    private By downloadBtn =  By.cssSelector("a[href*='1480937785']");
    private By productBtn =  By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div/div/div[2]/section/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a");
    private By homeSavingBonusBtn =  By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div/div/div[4]/section/div/div[3]/div/div/a");
    private By compareProductsBtn =  By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div/div/div[5]/section/div/div[3]/div/div/a");
    private By emailBtn =  By.name("emailAddress");
    private By submitBtn = By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div/div/div[9]/section/div/div/div[2]/form/div/a");
    private By confirmMessage = By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div/div/div[9]/section/div/div/div[2]/div[1]");

    public void setDownloadBtn() throws InterruptedException {
       scroll(downloadBtn);
        click(downloadBtn);
        Thread.sleep(5000);
    }

    public String getNewWindowUrl(){
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

       // Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }
        String url = driver.getCurrentUrl();
        return url;
    }

    public void setProductBtn () throws InterruptedException {
        scroll(productBtn);
        click(productBtn);
        Thread.sleep(5000);
    }

    public void setHomeSavingBonusBtn () {
        scroll(homeSavingBonusBtn);
        click(homeSavingBonusBtn);

    }

    public void setCompareProductsBtn () {
        scroll(compareProductsBtn);
        click(compareProductsBtn);

    }

    public void setEmailBtn () {
        scroll(emailBtn);
        click(emailBtn);
        addText(emailBtn,"ahd.dd@hotmail.com");

    }

    public void setSubmitBtn () throws InterruptedException {
        Thread.sleep(3000);
        click(submitBtn);

    }

    public String setConfirmMessage() throws InterruptedException {
        Thread.sleep(3000);
        return getText(confirmMessage);
    }

}
