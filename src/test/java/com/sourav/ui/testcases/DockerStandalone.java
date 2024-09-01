package com.sourav.ui.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.sourav.base.TestBase;

public class DockerStandalone {

	@Test
	public void launchDocker() throws MalformedURLException, InterruptedException
	{
		 // Define the desired capabilities for the browser
	  DesiredCapabilities cap = new DesiredCapabilities();
	
	  //  options.addArguments("--headless");  // Run in headless mode (optional)
	    
	    // URL of the hub
	    URL hubUrl = new URL("http://localhost:4444");

	    // Initialize the RemoteWebDriver with the hub URL and browser options
	   WebDriver driverGrid = new RemoteWebDriver(hubUrl,cap);
	   
	   // Perform your test
	   driverGrid.get("https://www.google.com");
       System.out.println("Title: " + driverGrid.getTitle());
       driverGrid.findElement(By.xpath("//textarea[@name='q']")).sendKeys("sourav1");
       driverGrid.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
       Thread.sleep(10000);
       driverGrid.close();
	    
	}
	
	
	
	
	
	
}
