package com.internet.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test(priority=0)
   public void testMethod1()
   {
	   
	  // WebDriverManager.chromedriver().setup();
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("hello");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   driver.close();  
	   
	   
   }
	
	
	@Test(priority=0)
	   public void testMethod2()
	   {
		   
		  // WebDriverManager.chromedriver().setup();
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("//*/div/input")).sendKeys("hello");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   driver.close();  
		   
		   
	   }

}
