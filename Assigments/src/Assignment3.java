import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.findElement(By.xpath("//*[@align=\"center\" and text()='Protractor Tutorial'] ")).getText());
		driver.findElement(By.xpath("(//*[text()='Name']/following::input)[1]")).sendKeys("Testing Name");
		//driver.findElement(By.xpath("(//*[text()='Name']/following::input)[1]")).clear();
		driver.findElement(By.xpath("(//*[text()='Name']/following::input)[2]")).sendKeys("Testing@test.com");
		driver.findElement(By.xpath("(//*[text()='Name']/following::input)[3]")).sendKeys("ThisIsPassword");
		driver.findElement(By.xpath("//*[@id='exampleCheck1']")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']"));
		Select drop=new Select(dropdown);
		drop.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//*[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Birth')]")).click();
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div/strong/..")).getText());

		
		driver.close();

		
		

		
	}

}
