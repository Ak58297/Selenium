import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str = "610049";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (char c : ch) {
			System.out.print(" " + c);
		}

		char a = ch[0];
		char b = ch[1];
		char c = ch[2];
		char d = ch[3];
		char e = ch[4];
		char f = ch[5];
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.get("https://ims-external-sit.mbtapps.kfplcnp.com/?code=NzAyNzQyMWEtMjcyNy00ZWYwLTllMTYtNWYxMTBkOGIyMWNl");
//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.xpath("//a[contains(text(),\"Proceed to ims\")]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait=new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.titleContains("B&Q"));
		
		
		

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'1st')]/following-sibling::input)"))
					.sendKeys(Character.toString(a));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'2nd')]/following-sibling::input)"))
					.sendKeys(Character.toString(b));
		} catch (Exception e2) {

			System.out.println(e2);
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'3rd')]/following-sibling::input)"))
					.sendKeys(Character.toString(c));
		} catch (Exception e3) {
			// TODO Auto-generated catch block
			System.out.println(e3);
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'3rd')]/following-sibling::input)"))
					.sendKeys(Character.toString(c));
		} catch (Exception e4) {
			System.out.println(e4);
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'4th')]/following-sibling::input)"))
					.sendKeys(Character.toString(d));
		} catch (Exception e5) {
			System.out.println(e5);
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'5th')]/following-sibling::input)"))
					.sendKeys(Character.toString(e));
		} catch (Exception e6) {
			System.out.println(" not present");
		}

		try {
			driver.findElement(By.xpath("(//*[contains(text(),'6th')]/following-sibling::input)"))
					.sendKeys(Character.toString(f));
			// }
		} catch (NoSuchElementException e3) {
			// TODO Auto-generated catch block
			System.out.println(" not present");
		}

		driver.findElement(By.xpath("//*[contains(text(),'Validate code')]")).click();
	}

}
