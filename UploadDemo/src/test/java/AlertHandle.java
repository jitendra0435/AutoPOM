import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {
    WebDriver driver=new ChromeDriver();

    @Test
    public void methodFor_HandlingAlert() throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement login=driver.findElement(By.xpath("//input[@name='proceed']"));
        login.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        WebElement id=driver.findElement(By.id("login1"));
        id.sendKeys("jitendrabachhav.2020");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("Jitu9049@");
        Thread.sleep(2000);
        WebElement login1=driver.findElement(By.xpath("//input[@name='proceed']"));
        login1.click();
    }
}
