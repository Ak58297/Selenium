import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingPracticeSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("datepicker")).click();
		//select current day
		System.out.println("Current date: "+driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"]")).getText());
		driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"]")).click();
	
		
		//select tomorrows date
		driver.findElement(By.id("datepicker")).click();
		System.out.println(driver.findElement(By.xpath("(//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']//following::td)[1]/a")).getText());
		driver.findElement(By.xpath("(//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']//following::td)[1]")).click();
	
		
		//select future date : MyBirthday
		driver.findElement(By.id("datepicker")).click();
		while(!driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("june"))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		driver.findElement(By.xpath("//a[text()='9']")).click();
		
	}

}
