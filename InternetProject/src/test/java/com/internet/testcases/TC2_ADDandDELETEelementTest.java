package com.internet.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P3_AddRemoveElementsPage;

import TestBase.BaseClass;

public class TC2_ADDandDELETEelementTest extends BaseClass{
	
	P1_IndexPage indexPage;
	P3_AddRemoveElementsPage addRemove;
	
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
	
	@Test(priority =0)
	public void addElements()

	{
		indexPage = new P1_IndexPage();
		addRemove =indexPage.clickOnAddRemove();
		
		for(int i=0 ;i<3 ;i++)
		{
			addRemove.clickOnElement();
		}
		for(int i=0 ;i<3 ;i++)
		{
			addRemove.removeElement();
		}
		
	}
	
	
}
