package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.HomePage;

public class HomePageValidationsTest {
	
	@Test
	public void homePageValidation()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		HomePage hp=new HomePage(driver);
		System.out.println(hp.HomeTexts().getText());
		
	}

}
