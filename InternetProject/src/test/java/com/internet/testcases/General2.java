package com.internet.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class General2 {
     @Test
	public void testing()
	{
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//driver.findElement(By.xpath("test")).click();
		//driver.switchTo().alert();
		
		driver.findElement(By.xpath("///input[@name='email']")).sendKeys("abc");
	
		
		
	}
	
}
