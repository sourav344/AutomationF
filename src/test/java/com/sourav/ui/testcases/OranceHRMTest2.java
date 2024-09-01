package com.sourav.ui.testcases;

import org.testng.annotations.Test;

import com.sourav.base.TestBase;

import demoTests.Pages.OrangeHRMDashboard;
import demoTests.Pages.OrangeHRMLogin;


public class OranceHRMTest2 extends TestBase{


	@Test
	public void OrangeTestLoginValidation() throws InterruptedException
	{
		OrangeHRMLogin OrangeHCMLogin = new OrangeHRMLogin(driver);
		
		OrangeHCMLogin.logintoOrangeHCM("Admin", "admin123");
		Thread.sleep(10000);
		
		OrangeHRMDashboard dashboard = new OrangeHRMDashboard(driver);
		dashboard.isElementPresent(dashboard.header);
		
		
	}
	
	
	
	
	
}
