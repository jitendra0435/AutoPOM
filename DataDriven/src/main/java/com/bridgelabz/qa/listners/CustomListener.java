package com.bridgelabz.qa.listners;
import com.bridgelabz.qa.base.BaseC;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends BaseC implements ITestListener
{
    BaseC baseC =new BaseC();

    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test On start ......." +
                ""+result.getName());
        try {
            baseC.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test which are passed ......." +
                ""+result.getName());
        try {
            baseC.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test which are failure......." +
                ""+result.getName());
        try {
            baseC.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {

    }

    @Override
    public void onStart(ITestContext context)
    {

    }

    @Override
    public void onFinish(ITestContext context)
    {

    }
}