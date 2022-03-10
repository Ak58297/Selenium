package objectRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver d;
	public HomePage(WebDriver driver) {
		this.d=driver;
	}

	By logo=By.xpath("(//a[contains(text(),'jQuery UI')])[2]");
	public WebElement HomeTexts()
	{
		return d.findElement(logo);
	}
	
	
	
	
}
