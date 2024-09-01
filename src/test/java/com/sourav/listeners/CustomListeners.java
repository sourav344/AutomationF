package com.sourav.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.sourav.utilities.ExtentManager;
import com.sourav.utilities.SeleniumUtil;

public class CustomListeners implements ITestListener{
	 private ExtentTest test;
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        // This method is invoked when a test method starts.
	        System.out.println("Test Started: " + result.getName());
	        test = ExtentManager.getExtentReports().createTest(result.getMethod().getMethodName());
	        ExtentManager.setExtentTest(test);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // This method is invoked when a test method finishes successfully.
	        System.out.println("Test Passed: " + result.getName());
	        ExtentManager.getExtentTest().pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // This method is invoked when a test method fails.
	        System.out.println("Test Failed: " + result.getName());
	        String screenshotPath = SeleniumUtil.captureScreenshot();
	        ExtentManager.getExtentTest().fail("Test failed");
	        ExtentManager.getExtentTest().addScreenCaptureFromPath(screenshotPath);
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // This method is invoked when a test method is skipped.
	        System.out.println("Test Skipped: " + result.getName());
	        ExtentManager.getExtentTest().skip("Test skipped");
	    }


	    @Override
	    public void onStart(ITestContext context) {
	        // This method is invoked before any test method starts.
	        System.out.println("Test Suite Started: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // This method is invoked after all the test methods have finished.
	        System.out.println("Test Suite Finished: " + context.getName());
	        ExtentManager.getExtentReports().flush();
	    }
	    
	

}
