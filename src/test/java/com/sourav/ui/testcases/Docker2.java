package com.sourav.ui.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sourav.base.DockerBase;

public class Docker2 extends DockerBase{

	@Test
	public void runDocker() throws MalformedURLException, InterruptedException
	{
		
		WebDriver driver  = initializeBrowser("firefox");
		driver.get("https://www.google.com");
	    System.out.println("Title: " + driver.getTitle());
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("sourav1");
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	    Thread.sleep(160000);
	    driver.close();
		
	}
}
