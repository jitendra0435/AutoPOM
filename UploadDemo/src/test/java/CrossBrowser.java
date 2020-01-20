import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
    WebDriver driver;

    @Test
    @Parameters("browser")
    public void givenMethodIntroducingCrossBrowsing(String browserName ){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
            driver=new ChromeDriver();
            driver.get("https://www.guru99.com/");
        }
        else if(browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/home/admin1/Desktop/UploadDemo/Driver/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        }
        driver.manage().window().maximize();

        driver.quit();
    }
}
