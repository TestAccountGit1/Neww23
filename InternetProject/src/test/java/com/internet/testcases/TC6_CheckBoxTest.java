package com.internet.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P6_CheckBoxPage;

import TestBase.BaseClass;

public class TC6_CheckBoxTest extends BaseClass{
	
P1_IndexPage indexPage;
P6_CheckBoxPage checkBox;
	
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(@Optional("chrome") String browser)
	{
		setBrowser(browser);
	}
 
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test
	public void checkboxValidation()
	{
		indexPage = new P1_IndexPage();
		checkBox = indexPage.clickOnCheckBox();
		boolean result = checkBox.checkBoxTesting();
		System.out.println(result);
		
		checkBox.clickSelect();
	}
	
	
	

}
