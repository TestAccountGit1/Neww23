package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import TestActions.Action;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public  void retreiveInput() throws Exception
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\Configuration.properties");
		prop = new Properties();
		prop.load(fis);
		
	
	}
	
	
	
	public void setBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	
}
