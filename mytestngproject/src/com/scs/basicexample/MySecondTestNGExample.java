package com.scs.basicexample;

import org.testng.annotations.Test;

public class MySecondTestNGExample {
@Test(priority = 2)
public void fun1()
{
	System.out.println("Test Priority One");
}
@Test(priority = 1)
public void fun2()
{
	System.out.println("Test Priority Two");
}
}
