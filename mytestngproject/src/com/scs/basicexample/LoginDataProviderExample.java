package com.scs.basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviderExample {
    WebDriver driver;
	@BeforeTest
    public void setUp() {
      
        driver = new ChromeDriver();
        driver.get("https://eroomrent.in/ownerlogin.php"); // URL of the login page
    }
	@Test(dataProvider = "loginData")
	public void verifyLogin(String uname,String upass)
	{
		    WebElement usernameField = driver.findElement(By.name("txtEmail"));
	        WebElement passwordField = driver.findElement(By.name("txtPassword"));
	        WebElement loginButton = driver.findElement(By.name("btnsubmit"));

	        usernameField.clear(); // Clear any existing text
	        passwordField.clear(); // Clear any existing text

	        usernameField.sendKeys(uname);
	        passwordField.sendKeys(upass);
	        loginButton.click();
	}
	 @DataProvider(name = "loginData")
	    public Object[][] provideLoginData() {
	        return new Object[][] {
	            { "user1@gmail.com", "12345678" },
	            { "user2@gmail.com", "12345678" },
	            { "user3@gmail.com", "124345678" }
	        };
	    }
	 
	 @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
