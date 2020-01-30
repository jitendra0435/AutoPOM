import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DragandDrop {

    WebDriver driver=new ChromeDriver();

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
    }

    @Test(description = "given method for drag and drop file demo")

    public void givenMethodForDragAndDropFile() throws InterruptedException {
        driver.switchTo().frame(0);
        Actions act=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        Thread.sleep(3000);
        WebElement dest=driver.findElement(By.id("droppable"));
        Thread.sleep(3000);
        act.dragAndDrop(source,dest).build().perform();
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
