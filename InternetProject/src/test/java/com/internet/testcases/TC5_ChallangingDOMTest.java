package com.internet.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P5_ChallangingDOM;

import TestBase.BaseClass;

public class TC5_ChallangingDOMTest extends BaseClass{
	
	P1_IndexPage indexPage;
	P5_ChallangingDOM challangeDom;
	
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
	public void tableEvaluate()
	{
		indexPage = new P1_IndexPage();
		challangeDom = indexPage.clickOnDOM();
		WebElement table1 = challangeDom.getTableValue();
		
		List<WebElement> row_count = table1.findElements(By.tagName("tr"));
		int row_count1 =  row_count.size();
		System.out.println(row_count1);
		
		for(int i=0 ; i< row_count1 ;i++)
		{
			List<WebElement> column_count = row_count.get(i).findElements(By.tagName("td"));
			int column_count1 = column_count.size();
					{
				
						for(int j=0 ; j<column_count1 ;j++)
						{
							String text = column_count.get(j).getText();
							System.out.println(i+" "+j+"  "+text);
							
						}
						
					}
			
		}
		
	}
	

	
}
