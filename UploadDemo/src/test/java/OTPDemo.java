import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OTPDemo {

    public static final String ACC_SID="AC4016f8369f1a33c3f1f37419a26d6ad1";
    public static final String AUTH_TOKEN="7a256be32cdd5dcb76644969442ce12e";

    WebDriver driver=new ChromeDriver();
    @BeforeMethod

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/Music/chrome/chromedriver");
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void methodForHandlingOTP() throws InterruptedException {

        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("jitendraBachhav");

        Thread.sleep(1000);

        driver.findElement(By.id("//span[@class='a-dropdown-prompt']")).click();

        driver.findElement(By.xpath("//a[@id='auth-country-picker_212']")).click();

        driver.findElement(By.id("ap_phone_number")).sendKeys("+12695335485");

        driver.findElement(By.id("ap-password")).sendKeys("jitendra123456");

        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }

}
