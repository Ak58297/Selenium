package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void method()
	{
		System.out.println("This method will be executed 10 times");
	}
}
