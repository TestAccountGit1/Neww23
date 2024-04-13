package com.internet.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P7_ContextMenuPage;

import TestBase.BaseClass;

public class TC7_ContextMenuTest extends BaseClass {

	P1_IndexPage indexPage;
	P7_ContextMenuPage context;
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(@Optional("chrome") String browser)
	{
		setBrowser(browser);
	}
 
	/*@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	*/
	@Test
	public void clickCheck()
	{
		indexPage = new P1_IndexPage();
		context = indexPage.clickOnContext();
		context.rightclick();
		
	}
}
