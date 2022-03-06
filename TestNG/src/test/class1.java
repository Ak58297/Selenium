package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class class1 {
	@AfterTest
	public void method1()
	{
		System.out.println("Will execute at the bottom of Scenario 1");
		System.out.println("Inside class1 , method 1");
	}

}
