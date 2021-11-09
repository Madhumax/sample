package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.AddToCartUI;

public class AddToCart
{
	
	public WebDriver driver;

	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	
	
	public WebElement addToCart()
	{
		return driver.findElement(AddToCartUI.cart);
	}
	
	
}
