package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.testng.internal.BaseClassFinder;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	@Given("user is on adactin page")
	public void user_is_on_adactin_page() throws InterruptedException {
		chromeBrowser();
		lunchUrl("https://adactinhotelapp.com/");
		Thread.sleep(5000);
		maximizeBrowser();

	}

	@When("user enter the valid {string}and{string} and click login")
	public void user_enter_the_valid_and_and_click_login(String string, String string2) throws InterruptedException {
	
	}

	@When("user enter valid {string},{string},{string},{string},{string},{string}")
	public void user_enter_valid(String string, String string2, String string3, String string4, String string5,
			String string6) {
		
	}

	@When("user click the select hotels")
	public void user_click_the_select_hotels() {
		

	}

	@When("user clcik the search buttons")
	public void user_clcik_the_search_buttons() {

	}

	@When("user enter the valid {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_valid(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

	}

	@Then("user click Book Now")
	public void user_click_Book_Now() {

	}

}
