import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class HandleBrowserPopup {
    WebDriver driver=new ChromeDriver();

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("");
    }

}
