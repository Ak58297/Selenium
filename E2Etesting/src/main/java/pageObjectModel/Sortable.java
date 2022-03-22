package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sortable {
	
	
	public WebDriver driver;
	
	
	By sortablelink= By.xpath("//a[contains(text(),'Sortable')]");
	
	public Sortable(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement SortLink()
	{
		return driver.findElement(sortablelink);
	}

}
