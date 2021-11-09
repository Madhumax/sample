package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.LoginPageUI;

public class LoginPage
{
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getsignin()
	{
		return driver.findElement(LoginPageUI.signin);
	}
	public WebElement getemail()
	{
		return driver.findElement(LoginPageUI.email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(LoginPageUI.password);
	}
	public WebElement getsubmit()
	{
		return driver.findElement(LoginPageUI.submit);
	}
	
}
