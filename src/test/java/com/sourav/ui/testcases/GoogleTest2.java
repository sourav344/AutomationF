package com.sourav.ui.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sourav.base.TestBase;
import com.sourav.utilities.ExcelReader;

import demoTests.Pages.GoogleSearch;



public class GoogleTest2 extends TestBase {

	@Test(dataProvider="getData")
	public void dataTest(String searchWord1, String searchWord2, String runMode) throws InterruptedException
	{
		if(!runMode.equals("Y"))
		{
			throw new SkipException("Skipping the testcase as the runMode is No");
		}
		GoogleSearch google = new GoogleSearch(driver);
		google.clearbyEle(google.textfield);
		google.type(google.textfield, searchWord1);
		
		
	}
	@DataProvider()
	public Object[][] getData() throws InvalidFormatException
	{
		 ExcelReader excelReader = new ExcelReader("src\\test\\resources\\excel\\TestData.xlsx", "Sheet1");
	        return excelReader.getSheetData();
		
	}
}
