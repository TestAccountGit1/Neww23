package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import TestActions.Action;
import TestBase.BaseClass;

public class P6_CheckBoxPage extends BaseClass{
	
	@FindBy(xpath = "//./*[@id='checkboxes']//following::input")
	WebElement checkBox1;
	
	@FindBy(xpath ="//./*[@id='checkboxes']//following::input//following::input")
	WebElement checkBox2;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	WebElement click4;
	
	public P6_CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean checkBoxTesting()
	{
		return Action.isSelected(checkBox2);
	}
	
	public void clickSelect()
	{
		Action.implicitlyWaitmethod(driver, 30);
		click4.click();
		Action.click(driver, checkBox2);
	}

}
