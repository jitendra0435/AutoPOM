import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class HandlingOTP {
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

        driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("jitendraBachhav");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("auth-country-picker_212")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("ap_phone_number")).sendKeys("2695335485");

        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("jitendra123456");

        driver.findElement(By.xpath("//input[@id='continue']")).click();

        Twilio.init(ACC_SID,AUTH_TOKEN);
        String smsBody=getMessage();
        System.out.println(smsBody);
    }


    public static String getMessage(){
        return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
                .filter(m -> m.getTo().equals("")).map(Message::getBody).findFirst()
                .orElseThrow(IllegalStateException::new);
    }
    private static Stream<Message> getMessages(){
        ResourceSet<Message> messages= Message.reader(ACC_SID).read();
        return StreamSupport.stream(messages.spliterator(),false);
    }

}
