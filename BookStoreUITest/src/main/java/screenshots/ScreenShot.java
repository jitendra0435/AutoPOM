package screenshots;

import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot extends Base {

    public void screenshot() throws IOException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        System.out.println("driver is "+driver);
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'").format(new Date());
        File destinationFile = new File("/home/admin1/Documents/BookStoreUITest/src/test/resources/Screenshot"+fileName);
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
