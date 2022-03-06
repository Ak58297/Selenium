package TestNG;

import org.testng.annotations.Test;

public class numberException1 {

	@Test(expectedExceptions=NumberFormatException.class)
	public void intTostring()
	{
		int i =21;
		String s=String.valueOf(i);
		
		String ss="11a";
		int j=Integer.parseInt(ss);
		
		System.out.print(ss);
	}

	
}
