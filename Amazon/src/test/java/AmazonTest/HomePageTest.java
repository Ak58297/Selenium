package AmazonTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.NavigateToURL;
import pageObjects.HomePage;


public class HomePageTest extends NavigateToURL {
	
	@Test
	public void HomePageTest() throws Throwable
	{
		URL();
		HomePage h=new HomePage(driver);
		
		h.AmazonLableMethod().isDisplayed();
		h.DontChangePOPUP().click();
		h.moveHoverClickOnSignButton();
		h.NavigateToHomePage();
		Assert.assertTrue(true, h.CartValueTobeZero());
		//Assert.assertEquals(h.CartValueTobeZero(), 0);
		h.ChangeCurrency();
		
		h.compareTwoStringOnHomePage();		
	}

}
