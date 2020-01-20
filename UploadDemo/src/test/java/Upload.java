import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Upload {
    WebDriver driver=new ChromeDriver();
    @BeforeMethod

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        driver.manage().window().maximize();
        StringSelection sel = new StringSelection("/home/admin1/Downloads/upload.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
        System.out.println("selection" + sel);
        driver.get("http://my.monsterindia.com/create_account.html");
    }

    @Test
    public void Fileupload() throws AWTException, InterruptedException{
        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("scroll(0,350)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='browse-text']")).click();

        Robot robot = new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}

