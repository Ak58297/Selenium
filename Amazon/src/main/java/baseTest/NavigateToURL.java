package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class NavigateToURL extends DriverInitialization {
	static String SiteURL;

	public static String URL() throws Throwable {

		driver = InitializeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		p.load(fis);
		SiteURL = p.getProperty("WebUrl");
		driver.get(SiteURL);
		driver.manage().window().maximize();
		return SiteURL;
	}
}
