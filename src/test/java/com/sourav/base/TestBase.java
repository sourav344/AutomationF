package com.sourav.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.sourav.utilities.ExtentManager;


public class TestBase {
	/*/
	 * WebDriver
	 * Properties
	 * Logs
	 * ExtentReports
	 * DB
	 * Excel
	 * Mail
	 * ReportNG, ExtentReports
	 * Jenkins
	 */
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	protected static final Logger log = LogManager.getLogger(TestBase.class);
	public String browser = null;	
    
	@BeforeSuite
	public void setUp() throws IOException
	{
		
		if(driver==null)
		{
			PropertyConfigurator.configure("src\\test\\resources\\properties\\log4j.properties");
			 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
				config.load(fis);
				log.debug("config loaded");
			
				
				 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
				 OR.load(fis);
					log.debug("OR loaded");
					System.out.println(OR.getProperty("textfield"));
					
					if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty())
					{
						browser = System.getenv("browser");
					}
					else
					{
						browser = config.getProperty("browser");
					}
					
					if(browser.equals("chrome"))
					{
						 driver = new ChromeDriver();
							log.debug("chrome launched");
					}
					
					else if(browser.equals("firefox"))
					{
						 driver = new FirefoxDriver();
						 log.debug("firefox launched");
					}
					driver.get(config.getProperty("URL"));
					log.debug("URL launched");
					driver.manage().window().maximize();
					log.debug("window maximized");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("Implicit_Time"))));
					
							
		}
		
	}
	
	
	  

	@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
		{
			 driver.quit();
			 log.debug("Test Execution completed");
		}
	}
	
}
