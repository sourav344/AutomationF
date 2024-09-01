package com.sourav.ui.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sourav.base.TestBase;

public class Assertion extends TestBase{
	
	SoftAssert softassert  = new SoftAssert();
@Test
public void testAssertion()
{
	
	String title = driver.getTitle();
	//softassert.assertEquals(title, "false title");
	softassert.assertEquals(title, "Google");
	softassert.assertAll();
	
}
	
}
