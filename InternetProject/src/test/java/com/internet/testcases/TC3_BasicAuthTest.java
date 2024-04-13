package com.internet.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.internet.pagesobj.P1_IndexPage;
import com.internet.pagesobj.P2_ABTestingPage;

public class TC3_BasicAuthTest {
	 @Test
	  public void set()
	  {
		  
   	  WebDriver driver = new ChromeDriver();
			
			//Set the username
			String username = "admin";
			
			//Set the password
			String password = "admin";
			
			
			String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
			driver.get(URL);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("p")).getText();
			
			System.out.println("The test present in page is ==> "+text);
			
			driver.close();
			driver.quit();
		
		  
	  }
	
	 
}
