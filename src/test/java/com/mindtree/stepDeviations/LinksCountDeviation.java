package com.mindtree.stepDeviations;

	import java.io.IOException;


import com.mindtree.pageObjects.CLandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
		public class LinksCountDeviation extends WebDriverHelper
		{
			int a;
		    @Given("^user chooses the chrome browser$")
		    public void user_chooses_the_chrome_browser() throws IOException 
		    {
		       driver=baseFile();
		    }
		    @And("^navigated to the link \"([^\"]*)\"$")
		    public void navigated_to_the_link(String strArg1)  {
		        driver.get(strArg1);

		    }
	
		    @When("^counts the number of links in the bottom of the page$")
		    public void counts_the_number_of_links_in_the_bottom_of_the_page() 
		    {
		    	CLandingPage lp=new CLandingPage(driver);
		    	 a=lp.getLinks();
		        System.out.println(lp.getLinks());
		    }
	
		    @Then("^printing the links count$")
		    public void printing_the_links_count() {
		        System.out.println(a);
		    }
	
		   
	
		    @And("^closed the browser$")
		    public void closed_the_browser() 
		    {
		        driver.close();
		    }
	
		}




