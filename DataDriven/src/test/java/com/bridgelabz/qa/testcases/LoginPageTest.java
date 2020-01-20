package com.bridgelabz.qa.testcases;
import com.bridgelabz.qa.base.BaseC;
import com.bridgelabz.qa.pompages.LoginPage;
import com.bridgelabz.qa.Controller.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginPageTest extends BaseC {

    @DataProvider(name = "testData")

        public Object[][] getData()throws IOException {
            ExcelUtil config = new ExcelUtil(EXCELPATH);
            int rows = config.getRowCount(0);
            Object[][] credentials = new Object[rows][2];

            for (int i = 0; i < rows; i++) {
                credentials[i][0] = config.getData(0, i, 0);
                credentials[i][1] = config.getData(0, i, 1);
            }
            return credentials;
        }

    @Test(dataProvider = "testData")
    public void loginPageTest(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        Thread.sleep(2000);
        loginPage.clickLogin();
        Thread.sleep(2000);
        loginPage.navigation();
        Thread.sleep(2000);
        loginPage.logOut();
    }
  }
