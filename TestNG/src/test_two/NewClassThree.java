package test_two;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewClassThree {
	
	@Test(dataProvider="UserPass")
	public void checkmethod(String Username, String Password)
	{
		System.out.println("check all the username and password one by one");
		System.out.println(Username);
		System.out.println(Password);
		
	}
	
	@DataProvider()
	public Object[][] UserPass()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="FirstUser";
		data[0][1]="FirstPassword";
		
		data[1][0]="SecondUser";
		data[1][1]="SecondPassword";
		
		data[2][0]="ThirdUser";
		data[2][1]="ThirdPassword";
		
		
		return data;
		
	}

}
