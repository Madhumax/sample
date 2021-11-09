package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.LandingPageUI;

public class LandingPage 
{
	public WebDriver driver;
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(LandingPageUI.searchBox);
	}
	public WebElement getTitle()
	{
		return driver.findElement(LandingPageUI.title);
	}
	public int countLinks()
	{
		WebElement navbarlinks= driver.findElement(LandingPageUI.navbar);
		return navbarlinks.findElements(LandingPageUI.navbarLinks).size();
	}
}
