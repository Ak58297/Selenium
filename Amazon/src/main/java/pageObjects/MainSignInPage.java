package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.DriverInitialization;

public class MainSignInPage extends DriverInitialization{
	
	By Email_inputbox= By.id("ap_email");
	public WebElement getEmail_inputbox()
	{
		return driver.findElement(Email_inputbox);
	}

	
	
	By Continuebutton= By.id("continue");
	public WebElement getContinuebutton()
	{
		return driver.findElement(Continuebutton);
	}
}
