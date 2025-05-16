package com.scs.basicexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void f11()
	{
		System.out.println("Before Suite 1");
	}
	@BeforeClass
	public void f22()
	{
		System.out.println("Before Class 1");
	}
	@BeforeTest
	public void test1()
	{
		System.out.println("Before Test1");
	}
	@Test
	  public void f() {
		  System.out.println("Test Class1");
	  }
	
	@AfterSuite
	public void f12()
	{
		System.out.println("After Suite 1");
	}
	@AfterClass
	public void f32()
	{
		System.out.println("After  Class Annotation");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test1");
	}
}
