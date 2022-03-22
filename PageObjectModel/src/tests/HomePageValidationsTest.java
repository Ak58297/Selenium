package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(By.xpath(null)));
		HomePage hp=new HomePage(driver);
		System.out.println(hp.HomeTexts().getText());
		
	}

}
