package com.internet.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P2_ABTestingPage;

import TestBase.BaseClass;

public class TC1_ABTest extends BaseClass{
	
	 P1_IndexPage indexPage;
	 P2_ABTestingPage abtesting;
	 
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
	 public void clickPage()
	 {
		 indexPage = new P1_IndexPage();
		 abtesting = indexPage.clickOnABTesting();
		 String str1 = abtesting.getText1();
		 System.out.println(str1);
	 }

}
