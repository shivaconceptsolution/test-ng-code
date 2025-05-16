package com.scs.basicexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class MyTestCaseExampleNew {
  @Test
  public void Login() {
	  
	  System.out.println("Login Test Case Method");
	  
  }
  
  @Test
  public void Reg() {
	  System.out.println("Registration Test Case Method");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Code");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Code");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Execution");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Execution");
  }
}
