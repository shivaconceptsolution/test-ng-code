package com.scs.basicexample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupExample {
@BeforeGroups("admin")
public void beforeAdminGroup()
{
	System.out.println("Before Admin");
}
@Test(groups={"admin"})	
public void fun1()
{
	System.out.println("Admin Group");
}
@Test(groups={"user"})	
public void fun2()
{
	System.out.println("User Group");
}
@Test(groups={"admin"})	
public void fun3()
{
	System.out.println("Admin Group");
}
@Test(groups={"user"})	
public void fun4()
{
	System.out.println("USER Group");
}

@Test(groups={"admin,user"})	
public void fun5()
{
	System.out.println("Admin User Common Group");
}
@AfterGroups("admin")
public void afterAdminGroup()
{
	System.out.println("After Admin Group");
}

}
