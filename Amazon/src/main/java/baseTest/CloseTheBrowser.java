package baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class CloseTheBrowser extends DriverInitialization{
	
	
	public static void CloseCurrentBrowser() throws Throwable
	{
		//driver = InitializeDriver();
		driver.quit();
	}

	
}
