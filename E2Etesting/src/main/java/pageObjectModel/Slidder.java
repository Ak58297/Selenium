package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slidder {

	public WebDriver driver;

	public Slidder(WebDriver driver2) {
		this.driver = driver2;

	}

	By sliderLink=By.xpath("//a[text()='Slider']");
	public WebElement SlidderElements()
	{
		
		return driver.findElement(sliderLink);	
	}
	
	
	By sliderbutton=By.xpath("//span[@tabindex='0']");

	public WebElement getsliderbutton() {
		return driver.findElement(sliderbutton);
	}
	

	By sliderheading=By.xpath("//h1[text()='Slider']");

	public WebElement getsliderHeading() {
		return driver.findElement(sliderheading);
	}
}
