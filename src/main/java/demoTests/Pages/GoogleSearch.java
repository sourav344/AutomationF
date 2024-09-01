package demoTests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sourav.utilities.SeleniumUtil;



public class GoogleSearch extends SeleniumUtil {

	public WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//textarea[@name='q']")
	public WebElement textfield;
	
	@FindBy(xpath="//table[@class='AaVjTc']")
	public WebElement footer; 
	
	
	
	
	
	
}
