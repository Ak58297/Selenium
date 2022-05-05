package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {

	public static Properties p;
	public static WebDriver driver;
	public static FileInputStream fis;

	public static WebDriver InitializeDriver() throws Throwable {
		p = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\ABHISHEK KUMAR\\Selenium_Workspace\\Amazon\\src\\main\\java\\resources\\data.properties");
		p.load(fis);
		String GivenBrowser = p.getProperty("browser");

		if (GivenBrowser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
			driver = new ChromeDriver();// webdriver: Interface ChromeDriver: Constructor

		}

		else if (GivenBrowser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Work\\gecko.exe");
			driver = new FirefoxDriver();// webdriver: Interface ChromeDriver: Constructor

		}
		
		else if (GivenBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Work\\gecko.exe");
			driver = new EdgeDriver();

		}
		return driver;
	}

}
