//package selenium_practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.textToBe(By.xpath("//button[text()='Request OTP']"), "Request OTP"));
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement gift = driver.findElement(By.xpath("//*[text()='Gift Cards']"));
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Login']"))).moveToElement(gift).click().build()
				.perform();
		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();

		// search an item
		WebElement search = driver.findElement(By.xpath("(//img[@title='Flipkart']//following::input)[1]"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Mens suit full").keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER).build().perform();

		// switch to new window
		/*
		 * Set<String> windows= driver.getWindowHandles(); 
		 * Iterator<String> it=windows.iterator();
		 * String Childwindow=it.next(); 
		 * StringParentwindow=it.next();
		 */

//select a KILLER Brand
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_2WkVRV']"));

		for (int i = 0; i < product.size(); i++) {
			String name = product.get(i).getText();
			System.out.println(name + "  ");

			if (name.equalsIgnoreCase("KILLER")) {

				driver.findElements(By.xpath("//div[@class='_2WkVRV']//following::a[@class='IRpwTa']")).get(i).click();

			} else {
				continue;
			}

			
		}
		
		// switch to new window

					Set<String> windows = driver.getWindowHandles();
					Iterator<String> it = windows.iterator();
					
					while(it.hasNext())
					{
						driver.switchTo().window(it.next());
						System.out.println("title : "+driver.getTitle());
						Thread.sleep(2000L);
					}
					

		// driver.quit();

	}

}
