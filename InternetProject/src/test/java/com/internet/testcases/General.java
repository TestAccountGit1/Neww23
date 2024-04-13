package com.internet.testcases;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class General {
	@Test
	public void remainingLinks()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		List<WebElement> linksValue = driver.findElements(By.tagName("a"));
		int count = linksValue.size();
		
		if(!linksValue.isEmpty() && !linksValue.equals(null))
		{
			
			for(int i=0; i<count;i++)
			{
				String str = linksValue.get(i).getText();
				if(str.equals("Drag and Drop"))
				{
					//driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
					//WebElement elementA = driver.findElement(By.xpath("//*/div[@id='columns']/div"));
					//WebElement elementB = driver.findElement(By.xpath("//*/div[@id='columns']/div//following::div"));
					
					//Actions action = new Actions(driver);
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
					//action.dragAndDrop(elementA,elementB).build().perform();
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		            // driver.navigate().back();	
		            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
					
					//driver.findElement(By.xpath("//*//ul//li[11]/a")).click();
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
					//WebElement element3 = driver.findElement(By.xpath("//select[@id='dropdown']"));
					 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
					  //element3.click();
					//Select s1 = new Select(element3);
					//s1.selectByValue("2");
		             
		             driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		             String parentWindow = driver.getWindowHandle();
		             System.out.println(parentWindow);
		            WebElement element10 =  driver.findElement(By.xpath("//*/div[@id='content']/div/a"));
		            WebDriverWait waiting = new WebDriverWait(driver , Duration.ofSeconds(30));
		            waiting.until(ExpectedConditions.visibilityOf(element10));
		            
		            element10.click();
		            Set<String> set1 = driver.getWindowHandles();
		            int size1 = set1.size();
		            for(int j=0;i<size1; j++)
		            {
		            	
		            }
		           for(String set2 :set1)
		           {
		        	  if(!set2.equals(parentWindow))
		        	  {
		        		  driver.switchTo().window(set2);
		        		  System.out.println(driver.getTitle());
		        		  
		        	  }
		        	  
		           }
		           driver.switchTo().window(parentWindow);
		           System.out.println(driver.getTitle());
					
					
				}
				
				
				
			}
			
		}
		
		
	}

}
