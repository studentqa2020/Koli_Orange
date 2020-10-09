package com.step.def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	private TimeUnit SECONDS;
	@Given("User is on Orange Hrm webpage")
	public void user_is_on_Orange_Hrm_webpage() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@When("User Enters Credentials and Submit")
	public void user_Enters_Credentials_and_Submit() {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	   
	}

	@Then("User LoggedIn")
	public void user_LoggedIn() {
		System.out.println(driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']")).getText());
	    
	}

	@Given("User is on Orange Hrm Dashboard")
	public void user_is_on_Orange_Hrm_Dashboard() {
		driver.findElement(By.className("main-menu-first-level-list-item")).click();
		driver.findElement(By.xpath("//*[@class='fontawesome-i2svg-active fontawesome-i2svg-complete']")).getText();
		
	   
	}

	@When("User check for the modules")
	public void user_check_for_the_modules() {
		driver.findElement(By.id("panel_wrapper_1")).getText();
	    
	}

	@Then("User gets the Module list")
	public void user_gets_the_Module_list() {
		driver.findElement(By.xpath("//*[@id='second']")).getText();
		driver.findElement(By.xpath("//*[@id='second']")).getText();
	    
	}

	@When("User click on Leave Module")
	public void user_click_on_Leave_Module() {
		
	   
	}

	@When("User Selects My Leave")
	public void user_Selects_My_Leave() {
		
	    
	}

	@Then("User select second row data")
	public void user_select_second_row_data() {
		driver.manage().timeouts().implicitlyWait(2000, SECONDS);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.className("panelContainer")).click();
	    
	}


}
