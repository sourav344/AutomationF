package com.sourav.ui.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sourav.base.TestBase;

public class GoogleTest extends TestBase {

	@Test
	public void LaunchGoogle() throws InterruptedException
	{
		driver.findElement(By.xpath(OR.getProperty("textfield"))).sendKeys("sourav");
		driver.findElement(By.xpath(OR.getProperty("textfield"))).sendKeys(Keys.ENTER);
		log.info("sourav is searched");
		
		System.out.println("End of code");
		
		//wait till footer loads completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("footer"))));
		
		//List all results (links)
		List<WebElement> ls = driver.findElements(By.xpath("//h3/parent::a"));
		
//		Actions action = new Actions(driver);
//		action.moveToElement(ls.get(0)).keyDown(Keys.CONTROL).click().keyUp((Keys.CONTROL)).build().perform();
//		System.out.println("URL launched in new tab with control click");
//		Thread.sleep(5000);
		
		//switch
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		System.err.println(driver.getTitle());
		Thread.sleep(5000);
	}
}
