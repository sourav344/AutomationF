package demoTests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sourav.utilities.SeleniumUtil;



public class OrangeHRMLogin extends SeleniumUtil {

	WebDriver driver;
	
	public OrangeHRMLogin(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password; 
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login_button; 
	
	
	
	
	public void logintoOrangeHCM(String UserNameVal, String PasswordVal)
	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		Login_button.click();
		
	}
	
	
	
}
