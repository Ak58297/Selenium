import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());

		
		//Count
		System.out.println(driver.findElements(By.xpath("//*[text()='Checkbox Example']//following::input[@type='checkbox']")).size());
		
		//Manage Alert
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		//driver.quit();
	}

}
