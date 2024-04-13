package com.internet.pagesobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestActions.Action;
import TestBase.BaseClass;

public class P1_IndexPage extends BaseClass{
	
	@FindBy(xpath = "//a[text()='A/B Testing']")
	WebElement a_b_Testing;
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	WebElement addRemoveElements;
	
	@FindBy(xpath ="//*[@id=\"content\"]/ul/li[3]/a")
	WebElement basicAuth;
	
	@FindBy(xpath ="//*[@id='content']/ul/li[5]/a")
	WebElement challengeDom;
	
	@FindBy(xpath ="//a[starts-with(@href,'/check')]")
	WebElement checkBox;
	
	@FindBy(xpath ="//a[starts-with(text(),'Context')]")
	WebElement contextMenu;
	
	@FindBy(xpath ="//a[text()='Challenging DOM']//following::a//following::a//following::a")
	WebElement digestAuth;
	
	@FindBy(xpath ="//a[text()='Drag and Drop' and @href='/drag_and_drop']")
	WebElement dragAndDrop;
	
	@FindBy(xpath ="//a[contains(text(),'Dropdown') or @href='/dropdown']")
	WebElement dropDown;
	
	@FindBy(xpath ="//a[text()='Broken Images']")
	WebElement broken;
	
	
	public P1_IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	


	public P2_ABTestingPage clickOnABTesting()
	{
		Action.explicitWait(driver, a_b_Testing ,50);
		Action.click(driver, a_b_Testing);
	
		return new P2_ABTestingPage();
		
	}
	
	
	public P3_AddRemoveElementsPage clickOnAddRemove()
	{
		Action.explicitWait(driver, addRemoveElements ,50);
		Action.click(driver, addRemoveElements);
	
		return new P3_AddRemoveElementsPage();
		
	}
	
	public P4_BrokenImagePage clickOnBroken()
	{
		Action.explicitWait(driver, broken ,50);
		Action.click(driver, broken);
	
		return new P4_BrokenImagePage();
		
	}
	
	public P5_ChallangingDOM clickOnDOM()
	{
		Action.explicitWait(driver, challengeDom ,50);
		Action.click(driver, challengeDom);
	
		return new P5_ChallangingDOM();
		
	}
	
	public P6_CheckBoxPage clickOnCheckBox()
	{
		Action.explicitWait(driver, checkBox ,50);
		Action.click(driver, checkBox);
	
		return new P6_CheckBoxPage();
		
	}
	public P7_ContextMenuPage clickOnContext()
	{
		Action.explicitWait(driver, contextMenu ,50);
		Action.click(driver, contextMenu);
	
		return new P7_ContextMenuPage();
		
	}
}
