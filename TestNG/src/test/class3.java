package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class class3 {
	@Test
	public void method1()
	{
		System.out.println("Inside class3 , method 1");
	}
	@Test
	public void method22()
	{
		System.out.println("Inside class3 , method 22");
	}
	@BeforeSuite
	public void method23()
	{
		System.out.println("After suite: This will triger before a the package ");
	}

}
