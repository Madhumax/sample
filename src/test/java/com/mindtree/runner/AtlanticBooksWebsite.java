package com.mindtree.runner;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageObjects.AddToCart;
import com.mindtree.pageObjects.BooksPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.LoginPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utility.ExcelClass;

public class AtlanticBooksWebsite extends WebDriverHelper
{
	private static Logger log = LogManager.getLogger(AtlanticBooksWebsite.class.getName());
	
	@BeforeMethod
	public void intoTheUrl() throws IOException
	{
		System.out.println("started now");
		driver=baseFile();
		
	}
	
	@Test(dataProvider="data")
	public void login(String username,String password) throws InterruptedException, IOException
	{
		log.info("In the login TestCase");
		driver.get(prop.getProperty("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getsignin().click();
		log.info("Clicked on Login link");
		Thread.sleep(2000L);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		log.info("Username and passsword were sent");
		lp.getsubmit().click();
		log.info("Clicked on sign in");
	
	}
	
	@Test
	public void cart() throws InterruptedException
	{
		log.info("In the cart TestCase");
		driver.get(prop.getProperty("url"));
		LandingPage h=new LandingPage(driver);
		h.searchBox().click();
		log.info("clicked on search page");
		h.searchBox().sendKeys("Gmat");
		Thread.sleep(1000);
		h.searchBox().sendKeys(Keys.ARROW_DOWN);
		h.searchBox().sendKeys(Keys.ARROW_DOWN);
		h.searchBox().sendKeys(Keys.ENTER);
		log.info("GMAT key is searched in search box");
		Thread.sleep(2000);
		BooksPage b=new BooksPage(driver);
		b.getBook().click();
		log.info("selected the book");
		AddToCart atc=new AddToCart(driver);
		atc.addToCart().click();
		log.info("added to the cart");
		
	}

	@Test
	public void countLinks()
	{
		log.info("In the countLinks function");
		driver.get(prop.getProperty("url"));
		LandingPage h=new LandingPage(driver);
		System.out.println(h.countLinks());
	}
	@Test
	public void SelectingBooks() throws IOException, InterruptedException
	{
		log.info("In the Selecting Books TestCase");
		driver.get(prop.getProperty("url"));
		LandingPage h=new LandingPage(driver);
		h.searchBox().click();
		log.info("clicked on search page");
		Assert.assertEquals(h.getTitle().getText(), "ABOUT US123");
		log.info("verified the title ABOUT US");
		h.searchBox().sendKeys("Gmat");
		Thread.sleep(1000);
		h.searchBox().sendKeys(Keys.ARROW_DOWN);
		h.searchBox().sendKeys(Keys.ARROW_DOWN);
		h.searchBox().sendKeys(Keys.ENTER);
		log.info("GMAT key is searched in search box");
		Thread.sleep(2000);
		BooksPage b=new BooksPage(driver);
		b.getBook().click();
		log.info("selected the book");
	}
	@Test(dataProvider="excel")
	public void SelectingBooks(String key) throws IOException, InterruptedException
	{
		log.info("In the Selecting Books TestCase");
		driver.get(prop.getProperty("url"));
		LandingPage h=new LandingPage(driver);
		h.searchBox().click();
		log.info("clicked on search page");
		Assert.assertEquals(h.getTitle().getText(), "ABOUT US");
		log.info("verified the title ABOUT US");
		h.searchBox().sendKeys(key);
		Thread.sleep(1000);
		h.searchBox().sendKeys(Keys.ARROW_DOWN);
		h.searchBox().sendKeys(Keys.ENTER);
		log.info("Excel key is searched in search box");
		Thread.sleep(2000);
		BooksPage b=new BooksPage(driver);
		b.getBook().click();
		log.info("selected the book");
	}
	@DataProvider
	public Object[][] excel() throws IOException
	{
		ExcelClass e=new ExcelClass();
		ArrayList<String> al=e.getDetailsOfSheet();
		Object[][] a=new Object[3][1];
		a[0][0]=al.get(1);
		a[1][0]=al.get(2);
		a[2][0]=al.get(3);
		return a;
	}
	@DataProvider
	public Object[][] data() throws IOException
	{
		Object[][] a= new Object[2][2];
		a[0][0]="madhu@gmail.com";
		a[0][1]="123456";
		a[1][0]="kl@gmail.com";
		a[1][1]="123";
		
		return a;
	}
	
	@AfterMethod
	public void terminate()
	{
		System.out.println(driver.getTitle());
		driver.close();
	}
}
