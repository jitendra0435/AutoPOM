import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;

public class DownloadTest extends DownloadFile {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void downloadFileTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'test.txt')]")).click();
        Thread.sleep(2000);
        File listFiles[]=folder.listFiles();
       // Assert.assertEquals(listFiles.length,is(not(0)));

       for(File files:listFiles){
        // Assert.assertEquals(files.length(),is(not((long)0)));
       }
    }

    @AfterMethod
    public void tearDown() {
        quit();
    }

    @Test
    public void download() {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium.dev/downloads/");
        WebElement down=driver.findElement(By.xpath("//tr[3]//td[4]//a[1]"));
        down.click();
    }
}
