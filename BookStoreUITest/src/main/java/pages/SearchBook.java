package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBook extends Base {

    @FindBy(xpath = "//input[@placeholder='Search…']")
    WebElement searchBar;

    public SearchBook(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void searchBook(String bookName) throws InterruptedException {
        searchBar.sendKeys(bookName);
        Thread.sleep(3000);
    }
}
