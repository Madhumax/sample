package com.mindtree.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.WebDriverHelper;

public class Screenshot
{
	public static WebDriver driver=null;
	public static String getSS(String result) throws IOException
	{
		driver=WebDriverHelper.getDriver();
		System.out.println(driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=".\\Screenshots\\"+result+".jpg";
		FileUtils.copyFile(src,new File(path));
		return path;
	}
}
