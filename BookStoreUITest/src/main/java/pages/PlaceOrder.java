package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder extends Base {


    @FindBy(xpath = "//input[@name='Name']")
    WebElement name;

    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root testField']//input[@id='outlined-basic']")
    WebElement phone;

    @FindBy(xpath = "//div[@class='formHide']//div[2]//div[2]//div[1]//div[1]//input[1]")
    WebElement email;

    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[1]//input[1]")
    WebElement city;

    @FindBy(xpath = "//textarea[@id='outlined-multiline-static']")
    WebElement address;

    @FindBy(xpath = "//div[@class='formHide']//div[2]//div[1]//div[1]//div[1]//input[1]")
    WebElement pincode;

    @FindBy(xpath = "//div[4]//div[2]//div[1]//div[1]//input[1]")
    WebElement landmark;

    @FindBy(xpath = "//button[@class='place-order']")
    WebElement orderButton;

    @FindBy(xpath = "//div[@class='continue']")
    WebElement contButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement radioButton;

    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    WebElement checkOutButton;


    @FindBy(xpath = "//span[@class='MuiButton-label']")
    WebElement contShopping;

    public PlaceOrder(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void setName(String customerName) throws InterruptedException {
        name.sendKeys(customerName);
        Thread.sleep(2000);
    }

    public void setEmail(String customerEmail) throws InterruptedException {
        email.sendKeys(customerEmail);
        Thread.sleep(2000);
    }
    public void setPhone(String setPhone) throws InterruptedException {
        phone.sendKeys(setPhone);
        Thread.sleep(2000);
    }

    public void setCity(String cCity){
        city.sendKeys(cCity);
    }

    public void setPincode(String customerPincode) throws InterruptedException {
        pincode.sendKeys(customerPincode);
        Thread.sleep(2000);
    }

    public void setAddress(String customerAddress) throws InterruptedException {
        address.sendKeys(customerAddress);
        Thread.sleep(2000);
    }

    public void setLandmark(String customerlandmark) throws InterruptedException {
        landmark.sendKeys(customerlandmark);
        Thread.sleep(2000);
    }
    public void setOrderButton() throws InterruptedException {
        orderButton.click();
        Thread.sleep(2000);
    }


    public void setContinueButton() throws InterruptedException {
        contButton.click();
        Thread.sleep(2000);

    }

    public void setRadioButton() throws InterruptedException {
        radioButton.click();
        Thread.sleep(2000);
    }

    public void setCheckOut() throws InterruptedException {
        checkOutButton.click();
        Thread.sleep(2000);
    }

    public void setContShoppingButton() throws InterruptedException {
        contShopping.click();
        Thread.sleep(2000);
    }
}
