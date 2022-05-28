package baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CloseTheBrowser extends DriverInitialization{
	
	static WebDriver driverr;
	
//	public CloseTheBrowser(WebDriver driver)
//	{
//		this.driverr=driver;
//		
//	}
	
	
	public static void CloseCurrentBrowser()
	{
		driverr.close();
	}

	
}
