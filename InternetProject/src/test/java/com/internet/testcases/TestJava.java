package com.internet.testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJava {
    @Test
	public void javaScriptTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement alert = driver.findElement(By.id("alert1"));
		js.executeScript("arguments[0].click", alert);
		
		
	}
}
