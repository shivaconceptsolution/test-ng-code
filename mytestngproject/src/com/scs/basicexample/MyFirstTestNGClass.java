package com.scs.basicexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyFirstTestNGClass {
WebDriver driver;
@BeforeTest
public void beforeTestCase()
{
	System.out.println("Before Test Case");
	 driver = new ChromeDriver();
}
 @BeforeMethod
  public void clickHomePage()
  {
	 driver.get("https://eroomrent.in");
  }
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("About")).click();
  }
  
  @Test
  public void f1() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("FAQ")).click();
	 // Assert.assertTrue(true);
	 // WebDriver driver = new ChromeDriver();
	//  driver.get("https://shivaconceptsolution.com");
  }
 
  @AfterTest
  public void afterTestCase()
  {
	  System.out.println("After Test Case");
	  driver.close();
  }
  @AfterMethod
  public void afterTestCaseMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.navigate().back();
  }
}
