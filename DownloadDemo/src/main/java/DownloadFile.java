import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DownloadFile {
    WebDriver driver;
    File folder;

    public void initialization(){
        folder=new File(UUID.randomUUID().toString());
        folder.mkdir();

        System.setProperty("webdriver.chrome.driver","/home/admin1/Music/chrome/chromedriver");
        ChromeOptions options=new ChromeOptions();
        Map<String,Object> pref=new HashMap<String,Object>();
        pref.put("profile.Default_content_setting.popups",0);
        pref.put("download.default_directorty",folder.getAbsolutePath());
        options.setExperimentalOption("prefs",pref);
        DesiredCapabilities cap=DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY,options);
        driver=new ChromeDriver(options);
        driver.get("http://the-internet.herokuapp.com/download");
    }

    public void quit(){
        driver.quit();
        for(File file :folder.listFiles()){
            file.delete();
        }
        folder.delete();
    }
}
