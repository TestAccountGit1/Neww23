package com.internet.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P4_BrokenImagePage;

import TestBase.BaseClass;

public class TC4_BrokenImageTest extends BaseClass{

	P1_IndexPage indexPage;
	 P4_BrokenImagePage brokenPage;
	 
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
	public void brokenImageCheck()
	{
		indexPage = new P1_IndexPage();
		brokenPage = indexPage.clickOnBroken();
		List<WebElement> list = brokenPage.getAllImage();
		
		
			System.out.println(list.size());
			
			
			for(WebElement ele1 : list)
			{
				
				
	}
		
	}
}
