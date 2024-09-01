package com.sourav.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class SeleniumUtil {

	   
	  public static WebDriver driver;
		public SeleniumUtil (WebDriver driver)
		{
			this.driver = driver;
			
		}

	// Method to get the current ExtentTest instance
    protected static ExtentTest report() {
        return ExtentManager.getExtentTest();
    }

    // Shortened methods for logging
    protected static void pass(String message) {
    	report().pass(message);
    }

    protected static void fail(String message) {
    	report().fail(message);
    }

    protected static void info(String message) {
    	report().info(message);
    }
    
 
	
	public void clear(String locator)
	{
		
		driver.findElement(By.xpath(locator)).clear();
		pass("Textbox cleared successfully");
		
	}

	public void clearbyEle(WebElement ele)
	{
		
		ele.clear();
		pass("Textbox cleared successfully");
		
	}
	
	public void pressEnter(String locator)
	{
		
		driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
		pass("Enter pressed successfully");
		
	}
	
	
	public  void type(String locator, String value)
	{
		
		driver.findElement(By.xpath(locator)).sendKeys(value);
		pass("Searched successfully");
		
	}
	
	public  void type(WebElement ele, String value)
	{
		
		ele.sendKeys(value);
		pass("Searched successfully");
		
	}
	
	
	public void isElementPresent(String locator)
	{
	
			int count = driver.findElements(By.xpath(locator)).size();
			if(count>0)
			{
				pass("Element is present");
				
			}
			
			else
			{
				fail("Element is not present");
			}
			
		
	}
	

    public static String captureScreenshot()
    {
    	// Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
       String filepath = "screenshot.png";
        // Specify the destination path
        File destination = new File(filepath);
        try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filepath;

  
     
    }
}
