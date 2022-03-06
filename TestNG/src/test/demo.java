package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {

	@Test
	public void m1()
	{
		System.out.println("inside demo,method 1");
	}
	
	@BeforeTest(timeOut=5000)
	public void m2()
	{
		System.out.println("Will execute at the top of Scenario 1");
		System.out.println("inside demo , method 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Will execute before every method in class demo");
		
	}

	@Test
	public void m3()
	{
		System.out.println("inside demo,method 3");
	}
	@Test
	public void m4()
	{
		System.out.println("inside demo,method 4");
	}
	
	@BeforeClass
	public void m5()
	{
		System.out.println("this will run before all the methods in class DEMO");
	}

	
}
