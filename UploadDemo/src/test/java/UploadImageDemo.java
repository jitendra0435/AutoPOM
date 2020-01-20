import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadImageDemo {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/upload");
    }

    @Test
    public void uploadingTheImage() throws InterruptedException {
        String filepath="/home/admin1/Pictures/Wallpapers/Baba.jpg";
        WebElement choose=driver.findElement(By.xpath("//input[@id='file-upload']"));
        choose.sendKeys(filepath);
        Thread.sleep(2000);
        WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
        upload.click();
    }
}
