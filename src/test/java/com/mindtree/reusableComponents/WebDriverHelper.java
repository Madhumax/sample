package com.mindtree.reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper 
{
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver baseFile() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\com\\resources\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
}
