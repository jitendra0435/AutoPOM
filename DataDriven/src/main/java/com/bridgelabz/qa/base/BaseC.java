package com.bridgelabz.qa.base;
import com.bridgelabz.qa.listners.CustomListener;
import com.bridgelabz.qa.property.Library;
import com.bridgelabz.qa.constantpath.ConstantsI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseC implements ConstantsI
{
    String methodName=null;
    public static WebDriver driver;
    CustomListener eventListener;
    ChromeOptions options = new ChromeOptions();


    @BeforeMethod(description = "load driver for test")
    public void setUp(Method method)
    {
        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        String url = Library.getProperty(CONFIGPATH, "URL");
        eventListener=new CustomListener();
        driver.get(url);
    }
    public void screenshot() throws IOException
    {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'"+methodName).format(new Date());
        File destinationFile = new File("Screenshots.png"+fileName);
        FileUtils.copyFile(sourceFile, destinationFile);
    }

    @AfterMethod(description = "close driver after test")
    public void tearDown()
    {
        driver.close();
    }
}