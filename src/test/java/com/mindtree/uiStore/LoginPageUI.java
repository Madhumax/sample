package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class LoginPageUI 
{
	
	public static By signin=By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]/div/ul/li[4]/a");
	public static By email=By.cssSelector("[title='Email']");
	public static By password=By.cssSelector("[title='Password']");
	public static By submit=By.id("send2");
}
