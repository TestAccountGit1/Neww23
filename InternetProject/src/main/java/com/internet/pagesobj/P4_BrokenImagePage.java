package com.internet.pagesobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class P4_BrokenImagePage extends BaseClass{
	 
	@FindBy(tagName ="img")
	List<WebElement> imageLinks;
	
	public P4_BrokenImagePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public List<WebElement> getAllImage()
	{
		System.out.println(imageLinks);
		return imageLinks;
	}

}
