package AmazonTest;
import org.testng.annotations.Test;

import baseTest.DriverInitialization;
import baseTest.NavigateToURL;
import pageObjects.HomePage;
import pageObjects.MainSignInPage;

public class FailSignIn_WithWrongCredTest  extends DriverInitialization{
	@Test
	public void SignIn() throws Throwable
	{
		NavigateToURL.URL();
		HomePage hpp=new HomePage(driver);
		hpp.moveHoverClickOnSignButton();
		
		MainSignInPage msp=new MainSignInPage();
		
		String invalidnumber=p.getProperty("InvalidMobileNumber");
		msp.getEmail_inputbox().sendKeys(invalidnumber);
		
		msp.getContinuebutton().click();
		
		//Assert.assertEquals(invalidnumber, p.getProperty("IncorrectPhoneNumberMessage"));
		
		
		
	}

}
