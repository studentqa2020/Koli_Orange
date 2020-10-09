package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private static final int SECONDS = 0;
	WebDriver driver;
	
  @BeforeTest
  public void TestRun1() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();		
		System.out.println("Browser Open");
		
  }
  @Test
  public void TestRun2() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Get URL");
			
		
  }
  @Test
  public void TestRun3() {
	  	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");;
		System.out.println("Found Login Page");
  }
  
  @Test
  public void TestRun4() {
	  	driver.findElement(By.name("Submit")).click();
	    System.out.println("Log In Success");
	  
	  
  }
  @Test
  public void TestRun5() throws InterruptedException {
	  Thread.sleep(3, SECONDS);
	  	System.out.println(driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']")).getText());
		System.out.println("Found Module Names");
	  
  }
	/*
	 * @Test public void TestRun6() throws InterruptedException { Thread.sleep(3,
	 * SECONDS);
	 * driver.findElement(By.className("main-menu-first-level-list-item")).click();
	 * 
	 * System.out.println(driver.findElement(By.
	 * xpath("//*[@class='fontawesome-i2svg-active fontawesome-i2svg-complete']")).
	 * getText());
	 * System.out.println(driver.findElement(By.id("panel_wrapper_1")).getText());
	 * System.out.println("Modules are there"); }
	 */

	/*
	 * @Test public void TestRun7() throws InterruptedException { //Get the list of
	 * second modules
	 * System.out.println(driver.findElement(By.xpath("//*[@id='second']")).getText(
	 * )); System.out.println("All employee list");
	 * 
	 * }
	 */
  @AfterTest
  public void TestRun8() {
	  
	  driver.close();
	  
  }
  
}
