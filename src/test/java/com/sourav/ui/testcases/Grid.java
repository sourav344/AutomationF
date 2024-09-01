package com.sourav.ui.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.sourav.base.TestBase;

public class Grid {

	@Test
	public void launchGrid() throws MalformedURLException, InterruptedException
	{
		 // Define the desired capabilities for the browser
	    ChromeOptions options = new ChromeOptions();
	  //  options.addArguments("--headless");  // Run in headless mode (optional)
	    
	    // URL of the hub
	    URL hubUrl = new URL("http://localhost:4444/wd/hub");

	    // Initialize the RemoteWebDriver with the hub URL and browser options
	   WebDriver driverGrid = new RemoteWebDriver(hubUrl,options);
	   
	   // Perform your test
	   driverGrid.get("https://www.google.com");
       System.out.println("Title: " + driverGrid.getTitle());
       driverGrid.findElement(By.xpath("//textarea[@name='q']")).sendKeys("sourav1");
       driverGrid.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
       Thread.sleep(60000);
       driverGrid.close();
	    
	}
	
	
	
	
	
	
}
