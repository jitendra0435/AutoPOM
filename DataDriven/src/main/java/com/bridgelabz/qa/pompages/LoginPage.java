package com.bridgelabz.qa.pompages;
import com.bridgelabz.qa.base.BaseC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseC {

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id ="pass")
    private WebElement passd;

    @FindBy(xpath="//input[@id='u_0_b']")
    private WebElement loginBtn;

    @FindBy(xpath = "//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")
    private WebElement logout;

    @FindBy(xpath="//div[@id='userNavigationLabel']")
    private WebElement navigation;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(
                driver, this);
    }

    public void setUsername(String userName)
    {
        email.sendKeys(userName);
    }

    public void setPassword(String password)
    {
        passd.sendKeys(password);
    }

    public void clickLogin()
    {
        loginBtn.click();
    }

    public void navigation(){
        navigation.click();
    }
    public void logOut(){

        logout.click();
    }
}
