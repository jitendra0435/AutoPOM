package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortBookByPriceLowToHigh extends Base {

    @FindBy(xpath = "//select[@id='sortByDropDown']")
    WebElement dropdownList;

    @FindBy(xpath = "//select[@id='sortByDropDown']")
    WebElement lowToHigh;


    public SortBookByPriceLowToHigh(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void selectDropdownList(){
        dropdownList.click();
    }
    public void selectLowToHigh() throws InterruptedException {
        Select select=new Select(lowToHigh);
        select.selectByVisibleText("Price:low to high");
        Thread.sleep(2000);
    }
}
