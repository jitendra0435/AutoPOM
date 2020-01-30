import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDate {
    WebDriver driver=new ChromeDriver();
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/Music/chrome/chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

    }

    @Test
    public void givenMethod_ForSelectDateFromDropDownList() throws InterruptedException {

            WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
            day.click();
            Select select=new Select(day);
            select.selectByVisibleText("20");
            WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
            month.click();
            Select select1= new Select(month);
            select1.selectByVisibleText("Jan");
            WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
            year.click();
            Select select3=new Select(year);
            select3.selectByVisibleText("1998");
    }
}