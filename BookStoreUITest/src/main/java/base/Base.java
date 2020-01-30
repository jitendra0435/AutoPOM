package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class Base implements ConfigFiles {

    public static WebDriver driver;
    static {
        System.setProperty(CHROME_KEY,CHROME_VALUE);
    }

    public void initialization(){
        driver = new ChromeDriver();
        String url = Library.getProperty(CONFIG_PATH,"URL");
        driver.manage().window().maximize();
        driver.get(url);
        String ITO = Library.getProperty(CONFIG_PATH,"ImplicitTimeOut");
        int timeoutPeriod = Integer.parseInt(ITO);
        driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
