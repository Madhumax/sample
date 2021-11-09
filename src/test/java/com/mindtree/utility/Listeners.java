package com.mindtree.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Screenshot implements ITestListener 
{

	public void onStart(ITestContext arg0) 
	{
		System.out.println("started");
	}

	public void onTestFailure(ITestResult result) 
	{

		try {
			String path=getSS(result.getName());
		} catch (IOException e) {
			// e.printStackTrace();
		}
		System.out.println("The name of the testcase failed is :" + result.getName());
	}

}
