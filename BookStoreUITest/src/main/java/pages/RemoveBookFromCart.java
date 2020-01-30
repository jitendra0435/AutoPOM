package pages;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveBookFromCart {

    @FindBy(xpath = "//button[@class='remove']")
    WebElement remove;

    public RemoveBookFromCart(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public void setRemove() throws InterruptedException {
        remove.click();
        Thread.sleep(3000);
    }
}
