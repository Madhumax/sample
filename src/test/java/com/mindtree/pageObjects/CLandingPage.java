package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.CLandingPageUI;

public class CLandingPage 
{
	public WebDriver driver;
	
	public CLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public WebElement getlogin()
	{
		return driver.findElement(CLandingPageUI.login);
	}
	
	public int getLinks()
	{
		return driver.findElements(CLandingPageUI.links).size();
	}
	
}
