package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.CLoginPageUI;

public class CLoginPage 
{
	public WebDriver driver;
	public CLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public WebElement getEmail()
	{
		return driver.findElement(CLoginPageUI.email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(CLoginPageUI.password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(CLoginPageUI.submit);
	}
	
}
