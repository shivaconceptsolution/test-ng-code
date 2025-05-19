package com.scs.basicexample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ExplictWaitExample {
	@Test
	public void gSearch()
	{
		WebDriver driver = new ChromeDriver();  
	    driver.get("https://google.com/ncr");
	     driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
	     // Initialize and wait till element(link) became clickable - timeout in 10 seconds
	     WebElement firstResult = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	     // Print the first result
	     System.out.println(firstResult.getText());
	}

}
