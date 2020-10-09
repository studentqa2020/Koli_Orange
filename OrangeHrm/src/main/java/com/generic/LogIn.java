package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LogIn {
	
	

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();		
	System.out.println("Browser Open");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("Get URL");
	
	//signin the web page
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	System.out.println("Found Login Page");
		
	driver.findElement(By.name("Submit")).click();
    System.out.println("Log In Success");
    
    //check the modules are there
    System.out.println(driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']")).getText());
	System.out.println("Found Module Names");
	
	//click on Admin module
	driver.findElement(By.className("main-menu-first-level-list-item")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@class='fontawesome-i2svg-active fontawesome-i2svg-complete']")).getText());
	System.out.println(driver.findElement(By.id("panel_wrapper_1")).getText());
	System.out.println("Modules are there");	
	System.out.println(driver.findElement(By.xpath("//*[@id='second']")).getText());
			
	Thread.sleep(2000);
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.className("panelContainer")).click();
	
	System.out.println(driver.getTitle());
	/*
	 * Actions action = new Actions(driver);
	 * driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).
	 * action.moveToElement(web).build().perform() act acion.build().wait();
	 */
	driver.close();
	}
}
