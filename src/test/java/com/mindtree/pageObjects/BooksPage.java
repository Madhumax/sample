package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.BooksPageUI;

public class BooksPage {
	public WebDriver driver;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
	}

	

	public WebElement getBook() {
		return driver.findElement(BooksPageUI.book);
	}
}
