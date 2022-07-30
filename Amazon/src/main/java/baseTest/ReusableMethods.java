package baseTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ReusableMethods extends DriverInitialization {

	public static String TakeScreenshot(String TestCaseName) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Call getScreenshotAs method to create image file
		File Source = ts.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		String destinationPath = System.getProperty("user.dir") + "\\Reports\\" + TestCaseName + ".png";

		// Copy file at destination
		FileUtils.copyFile(Source, new File(destinationPath));
		return destinationPath;
	}
	
	
	
	
	
	

	static ExtentReports extent;

	@BeforeTest
	public static ExtentReports config() {
// ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir") + "\\Reports\\index.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Abhishek Kumar");
		return extent;
	}

	@Test
	public void initialDemo()

	{
		ExtentTest test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();

//test.fail("Result do not match");

		

	}

}
