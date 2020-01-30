package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends Base {

    @FindBy(xpath = "//div[@id='1']//button[@class='beforeAddToBag'][contains(text(),'ADD TO BAG')]")
    WebElement addToBag;

    @FindBy(xpath = "//div[@id='2']//button[@class='beforeAddToBag'][contains(text(),'ADD TO BAG')]")
    WebElement addToBag1;

    @FindBy(xpath = "//button[@class='cart-icon w3-btn']")
    WebElement cartButton;

    public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setAddToBag(){
        addToBag.click();
    }
    public void setAddToBag1(){
        addToBag1.click();
    }

    public void getCartButton(){
        cartButton.click();
    }
}
