package TestNG;

import org.testng.annotations.Test;

public class TestNG_2 {
	
	@Test
	public void login ()
	{
		System.out.println("Login into the application");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void test1()
	{
		System.out.println("Test the required scenatio part 1");
	}
	
	@Test(groups="WhiteBox")
	public void grouptest1()
	{
		System.out.println("First Test included in group white box testing");
	}
	
	@Test(groups="WhiteBox")
	public void grouptest2()
	{
		System.out.println("Second Test included in group white box testing");
	}
	@Test(groups="WhiteBox")
	public void grouptest3()
	{
		System.out.println("Third Test included in group white box testing");
	}
	
	@Test(dependsOnMethods="login")
	public void test2()
	{
		System.out.println("Test the required scenatio part 2");
	}

}
