package AmazonTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.NavigateToURL;
import pageObjects.HomePage;
import pageObjects.MainSignInPage;

public class FailSignIn_WithWrongCred extends NavigateToURL{
	@Test
	public void SignIn() throws Throwable
	{
		URL();
		HomePage hpp=new HomePage(driver);
		hpp.moveHoverClickOnSignButton();
		
		MainSignInPage msp=new MainSignInPage();
		
		String invalidnumber=p.getProperty("InvalidMobileNumber");
		msp.getEmail_inputbox().sendKeys(invalidnumber);
		
		msp.getContinuebutton().click();
		
		Assert.assertEquals(invalidnumber, p.getProperty("IncorrectPhoneNumberMessage"));
		
		
		
	}

}
