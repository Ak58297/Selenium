import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Basic {

	public static void main(String[] args) {

		/*
		 * • ChromeDriver: It is a interface that has all the methods to automate in chrome.
		 * • driver: driver object will have all the access of the methods of
		 * Chromedriver • There will be no difference in method name for different
		 * browser • Webdriver is an Interface that provides a set of automatable
		 * methods with empty bodies(Abstract methods) • All the Driver
		 * class(chromeDriver, FirefoxDriver, MicrosoftEdgeDriver,safariDriver, etc)
		 * implements the webdriver Abstract methods Q} Why we use WebDriver driver=new
		 * ChromeDriver() instead of ChromeDriver driver=new ChromeDriver?? A}
		 * Chromedriver can use webDriver implemented methods + personal defined
		 * methods(Class methods). So if chromedriver will use its personal define
		 * methods then those methods will not be used in other webdriver( Firefox
		 * driver, etc). So it’s always ideal to use Webdriver Driver because it will
		 * restrict us from using webdriver implemented methods. Both works but we will
		 * use WebDriver one.
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//h1[text()='Test automation practice form']")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Abhishek kumar");
		driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("1234567899");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("eeabhishek@email.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Address line One");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Address line One");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();

		// Radio button
		System.out.println(driver.findElement(By.xpath("//div[text()='CheckBox & Radio Button practice']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@id='female']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@id='male']")).click();

		// Give assertion on radio button to check whether it could be selected or not
		System.out.println(driver.findElement(By.xpath("//input[@id='other']")).isEnabled());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='other']")).isEnabled());

		System.out.println("Third radio buttonis is disabled");

		// Mostly select dropdown are static

		WebElement PlaceDropdown = driver.findElement(
				By.xpath("//div/label[text()='Where do you plan to travel this year?']//following::select"));
		Select dropdown = new Select(PlaceDropdown);
		dropdown.selectByIndex(0);
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("Denmark");
		dropdown.selectByValue("10");
		System.out.println(dropdown.getFirstSelectedOption().getText());
// dropdown.deselectByIndex(0);

		// checkbox
		System.out.println(driver.findElement(By.xpath("//*[@id='monday']")).isSelected());
		driver.findElement(By.xpath("//*[@id='monday']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='monday']")).isSelected());

		// Tuesday checkbox
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='tuesday']")).isSelected());
		driver.findElement(By.xpath("//*[@id='tuesday']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tuesday']")).isSelected());

		System.out.println("Number of checkbox present in the page : "+ driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//*[@type='checkbox']")).size(), 14);

		
		//Uploaad a file
		//driver.findElement(By.xpath("//*[@id='inputGroupFile02']")).click();
		
	
		//driver.findElement(By.xpath("//*[@id='inputGroupFile02']")).sendKeys("C:\\Users\\ABHISHEK KUMAR\\test.png");
	//driver.findElement(By.xpath("//*[@id='inputGroupFile02']")).sendKeys(Keys.ENTER);
		// driver.close();
		//driver.quit();

	}

}
