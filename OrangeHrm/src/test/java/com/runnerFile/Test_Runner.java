package com.runnerFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features =  {"features/orange.feature"},
		
		glue = 		{"com.step.def"},
		
		plugin = 	{"pretty", "html:target/site/cucumber-pretty", 
					 "rerun:target/rerun.txt",
					 "json:target/cucumber.json" },
		
			monochrome = true	
		)

public class Test_Runner extends AbstractTestNGCucumberTests{
	
}
