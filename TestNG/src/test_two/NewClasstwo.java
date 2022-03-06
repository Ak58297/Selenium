package test_two;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class NewClasstwo {
	@Test(groups={"SmokeTest"})
	public void newMethod2() {
		// TODO Auto-generated method stub
		System.out.println("Grouped: Inside new class two, method 1");

	}
	@Parameters({"globalvalue"})
	@Test
	public void newMethod3(String para) {
		// TODO Auto-generated method stub
		System.out.println("Inside new class two, method 3 with paramerters : "+para);

	}
	@Test
	public void newMethod4() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class two, method 4");

	}
	@Test
	public void newMethod5() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class two, method 5");

	}
	@Test(enabled=false)
	public void newMethod7() {
		// TODO Auto-generated method stub
		System.out.println("Inside new class two, method 7");

	}
}
