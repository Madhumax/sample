package com.mindtree.stepDeviations;

import java.io.IOException;

import com.mindtree.pageObjects.CLandingPage;
import com.mindtree.pageObjects.CLoginPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidationDeviation extends WebDriverHelper 
{
	@Given("user enters the chrome browser")
	public void user_chooses_the_chrome_browser() throws IOException 
	{
		driver=baseFile();
	}

	@And("navigated to the {string}")
	public void navigated_to_the(String string) 
	{
		driver.get(string);
		CLandingPage l=new CLandingPage(driver);
		l.getlogin().click();
	}

	@When("^user enters the (.+) and (.+) and login$")
    public void user_enters_the_and_and_login(String username, String password) throws Throwable {
		Thread.sleep(4000);
		CLoginPage lp=new CLoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSubmit().click();
	}

	@Then("validating the home page displayed")
	public void validating_the_home_page_displayed() 
	{
	   System.out.println("validated");
	}

	@And("close the browser")
	public void close_the_browser() 
	{
	   driver.close();
	}
}
