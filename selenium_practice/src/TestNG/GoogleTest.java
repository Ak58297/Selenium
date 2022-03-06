package TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@Test (priority=1)
	public void search1() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		//Thread.sleep(5000L);
		
	}
	
	
	@Test (priority=2)
	public void Indianflag() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000L);
		driver.findElement(By.id("dimg_21")).isDisplayed();
	}
	
	
	/*@BeforeSuite
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize(); 
		
		
	}*/
	
	
	@BeforeMethod
	public void BeforeStartingTheTest ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//will execute every time before starting the test
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	@AfterMethod
	public void AfterClosingTheTest ()
	{
		//will execute every time when tests are closed
		driver.quit();
		
	}
	
	
	

	
	
}
