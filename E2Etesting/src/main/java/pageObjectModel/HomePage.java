package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver dr;
	By hoverElement = By.xpath("//*[text()='Donate']");
	By mhover = By.xpath("//*[text()='JS Foundation']");
	
	public HomePage(WebDriver driver3) {
		this.dr=driver3;
	}
	public WebElement getmhover() {
		return dr.findElement(mhover);
	}
	public WebElement getmhovermethod() {
		return dr.findElement(hoverElement);
	}
}
