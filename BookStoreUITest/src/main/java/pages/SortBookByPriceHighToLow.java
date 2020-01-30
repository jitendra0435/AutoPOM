package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortBookByPriceHighToLow extends Base {
    @FindBy(xpath = "//select[@id='sortByDropDown']")
    WebElement dropdownList;

    @FindBy(xpath = "//select[@id='sortByDropDown']")
    WebElement hightoLow;

    public SortBookByPriceHighToLow(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void selectHighToLow() throws InterruptedException {
        dropdownList.click();
        Select select=new Select(hightoLow);
        select.selectByVisibleText("Price:high to low");
        Thread.sleep(2000);
    }
}
