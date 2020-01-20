package com.bridgelabz.qa.pompages;
import com.bridgelabz.qa.base.BaseC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SignUp extends BaseC {

    Robot robot=new Robot();
    @FindBy(xpath="//input[@id='u_0_w']")
    private WebElement firstName;

    @FindBy(id ="//input[@id='u_0_y']")
    private WebElement lastName;

    @FindBy(xpath="//input[@id='u_0_11']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='u_0_16']")
    private WebElement password;

    @FindBy(xpath="//select[@id='day']")
    private WebElement day;

    @FindBy(xpath="//select[@id='month']")
    private WebElement month;

    @FindBy(xpath = "//select[@id='year']")
    private WebElement year;

    @FindBy(xpath="//input[@id='u_0_a']")
    private WebElement gender;

    @FindBy(xpath ="//button[@id='u_0_1d']")
    private WebElement signup;


    public SignUp(WebDriver driver) throws AWTException {
        PageFactory.initElements(driver,this);
    }


    public void setFirstName(String firstName)
    {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName)
    {
        this.lastName.sendKeys(lastName);
    }

    public void setUsername(String email)
    {
        this.email.sendKeys(email);
    }

    public void setPassword(String password)
    {
        this.password.sendKeys(password);
    }

    public void setDay(){
        this.day.click();
        robot.keyPress(KeyEvent.VK_NUMPAD7);
        robot.keyRelease(KeyEvent.VK_NUMPAD7);
    }

    public void setMonth(){
        this.month.click();
        Select select =new Select(month);
        select.selectByIndex(5);
    }

    public void setYear(){
        this.year.click();
        Select select=new Select(year);
        select.selectByIndex(12);

    }

    public void signUpButton(){
        this.signup.click();
    }

}
