package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestActions.Action;
import TestBase.BaseClass;

public class P2_ABTestingPage extends BaseClass {

	@FindBy(xpath ="//*[@class='row']/div/div/h3//following::p")
	WebElement paragraphText;
	
	public P2_ABTestingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getText1()
	{
		//Action.implicitlyWaitmethod(driver, 10);
		String s = paragraphText.getText();
		return s;
	}
	
}
