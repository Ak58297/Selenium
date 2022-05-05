package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	
	
	public WebDriver driver;
	public Properties p;
	public WebDriver InitializeDriver() throws IOException
	{
		p=new Properties();//C:\Users\ABHISHEK KUMAR\Downloads\chromedriver_win32_97 (1)
		FileInputStream fIs=new FileInputStream("C:\\Users\\ABHISHEK KUMAR\\Selenium_Workspace\\E2Etesting\\src\\main\\java\\resources\\data.properties");
		p.load(fIs);
		String browserName=p.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\ABHISHEK KUMAR\\\\Downloads\\\\chromedriver_win32\\\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\\\Users\\\\ABHISHEK KUMAR\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	
	
	public void BackArrow()
	{
		driver.navigate().back();
	}
	 
}
