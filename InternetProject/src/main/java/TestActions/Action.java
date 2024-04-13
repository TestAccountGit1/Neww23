package TestActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseClass;

public class Action extends BaseClass {
	
	
	public static void click(WebDriver driver , WebElement element)
	{
		try {
			Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		System.out.println(element+" "+" clicked from Action Class");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

	
	public static void implicitlyWaitmethod(WebDriver driver , int timeOut)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		
	}
	
	public static void explicitWait(WebDriver driver , WebElement element ,int timeOut)
	{
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		waiting.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static boolean isSelected(WebElement ele)
	{
		boolean flag = false;
		if(ele.isSelected() == true)
		{
			flag = true;
			return flag;
		}
		else
		{
			flag = false;
			return flag;
		}
		
	}
	
	public static void rightClick(WebDriver driver , WebElement element )
	{
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
	}
}
