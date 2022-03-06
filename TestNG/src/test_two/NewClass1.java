package test_two;

import org.testng.annotations.Test;

@Test
public class NewClass1 {
	@Test
	public void newMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class one, method 1");

	}
	@Test
	public void newMethod2() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class one, method 2");

	}
	@Test
	public void newMethod3() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class one, method 3");

	}
	@Test(groups={"SmokeTest"})
	public void newMethod4() {
		// TODO Auto-generated method stub
		System.out.println("Grouped : Inside new class one, method 4");

	}


}
