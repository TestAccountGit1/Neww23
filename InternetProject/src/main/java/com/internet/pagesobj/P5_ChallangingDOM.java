package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestActions.Action;
import TestBase.BaseClass;

public class P5_ChallangingDOM extends BaseClass{
	
	@FindBy(xpath ="//h3[contains(text(),'Challenging DOM')]")
	WebElement text1;
	
	@FindBy(xpath ="//*[@id='content']/div/p")
	WebElement paragraph4;
	
	@FindBy(xpath ="//*[@class='large-12 columns large-centered']//following::a")
	WebElement firstLink;
	
	@FindBy(xpath ="//*[@class='large-12 columns large-centered']//following::a//following::a")
	WebElement secondLink;
	
	@FindBy(xpath ="//*[@class='large-12 columns large-centered']//following::a//following::a//following::a")
	WebElement thirdLink;
	
	@FindBy(xpath ="//*[@class='large-10 columns']//following::table")
	WebElement tableValue;
	
	public P5_ChallangingDOM()
	{
			PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getTableValue()
	{
		Action.explicitWait(driver, tableValue, 30);
		return tableValue;
	}
	

}
