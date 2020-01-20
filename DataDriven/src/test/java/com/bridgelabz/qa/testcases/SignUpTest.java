package com.bridgelabz.qa.testcases;
import com.bridgelabz.qa.base.BaseC;
import com.bridgelabz.qa.pompages.SignUp;
import org.testng.annotations.Test;
import java.awt.*;

public class SignUpTest extends BaseC {

    @Test()
    public void loginPageTest() throws AWTException {
        SignUp signUp= new SignUp(driver);
        signUp.setFirstName("jitendra");
        signUp.setLastName("patil");
        signUp.setUsername("7020376730");
        signUp.setPassword("123abc");
        signUp.setDay();
        signUp.setMonth();
        signUp.setYear();
        signUp.signUpButton();
    }
}
