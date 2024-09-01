package demoTests.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sourav.utilities.SeleniumUtil;



public class OrangeHRMDashboard extends SeleniumUtil {
	public WebDriver driver;

	    public OrangeHRMDashboard(WebDriver driver) {
	        super(driver);
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader1;
	
    public String header = "//h6[text()='Dashboard']";
	
	@FindBy(xpath="//input[@placeholder='Searchs']")
	public
	List<WebElement> searchField;
	
	@FindBy(xpath="//span[text()='Admin']")
	@CacheLookup
	public
	List<WebElement> Admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	public
	List<WebElement> PIM;
	
	@FindBy(xpath="//span[text()='Leave']")
	public
	List<WebElement> leave;
	
	@FindBy(xpath="//span[text()='Time']")
	public
	List<WebElement> time;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader7;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader8;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader9;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader10;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader11;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader12;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader13;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader14;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader15;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader16;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader17;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public
	List<WebElement> dashboardHeader18;

	
	
	
	
	
	
	
}
