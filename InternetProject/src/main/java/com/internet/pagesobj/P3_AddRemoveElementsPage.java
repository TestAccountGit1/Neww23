package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestActions.Action;
import TestBase.BaseClass;

public class P3_AddRemoveElementsPage extends BaseClass{

	@FindBy(xpath ="//button[@onclick='addElement()']")
	WebElement addElement;
	
	@FindBy(xpath = "//button[@onclick='deleteElement()']")
	WebElement deleteElement;
	
	public P3_AddRemoveElementsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnElement()
	{ 
	   Action.explicitWait(driver, addElement, 30);
		Action.click(driver, addElement);
		Action.implicitlyWaitmethod(driver, 50);
	}
	
	public void removeElement()
	{
		Action.explicitWait(driver, deleteElement, 30);
		Action.click(driver, deleteElement);
	}
}
