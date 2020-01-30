import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlreadyOpenedBrowser {

    @Test
    public void givenMethodForRunScriptOnAlreadyOpenedBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/Music/chrome/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","localhost:9018");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://codeburst.io/");
    }
}
