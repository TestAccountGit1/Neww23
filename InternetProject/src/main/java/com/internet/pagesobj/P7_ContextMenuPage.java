package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestActions.Action;
import TestBase.BaseClass;

public class P7_ContextMenuPage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='example']/div")
	WebElement clickableElement;
	
	public P7_ContextMenuPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void rightclick()
	{
		Action.explicitWait(driver, clickableElement, 20);
		Action.rightClick(driver, clickableElement);
		driver.switchTo().alert().accept();
	}
	

}
