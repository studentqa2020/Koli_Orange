package com.step.def;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.code.AgentInfo;
import com.cucumber.code.BaseLogin;
import com.cucumber.code.PropertySelection;
import com.cucumber.code.SetupBrowser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	private BaseLogin login;
	private PropertySelection ps;
	private AgentInfo agentinfo;

	@Given("User is on Orange Hrm Dashboard")
	public void user_is_on_Orange_Hrm_Dashboard() throws Throwable {
		driver = SetupBrowser.setup(driver);

		/*
		 * login=new BaseLogin(driver); login.openUrl(); ass ertEquals(driver.getTitle()
		 * ,"Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
		 */
		}

	@When("User check for the modules")
	public void user_check_for_the_modules() throws Throwable {
		login.clickSignIn();
		
	}

	

	@Then("User gets the Module list")
	public void user_gets_the_Module_list() {
		
	}

	

	@When("User click on Leave Module")
	public void user_click_on_Leave_Module() throws Throwable {
		ps.searchProperty();
	}
	@When("User Selects My Leave")
	public void user_Selects_My_Leave() {
	    
	}

	@Then("User select second row data")
	public void user_select_second_row_data() {
		
	}

	
	@Then("User Signs Out")
	public void user_Signs_Out() {
		driver.quit();
	}

}