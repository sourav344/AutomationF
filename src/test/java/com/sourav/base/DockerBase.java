package com.sourav.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerBase {

	public WebDriver initializeBrowser(String browserName) throws MalformedURLException
	{
		
		  if(browserName.equals("chrome")) {
		        ChromeOptions options = new ChromeOptions();
		        return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		    } else if(browserName.equals("firefox")) {
		        FirefoxOptions options = new FirefoxOptions();
		        return new RemoteWebDriver(new URL("http://35.154.169.54:4444/"), options);
		    }
		    else if(browserName.equals("edge")) {
		        EdgeOptions options = new EdgeOptions();
		        return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		    }
		  throw new IllegalArgumentException("Browser name not supported");
	}
}
