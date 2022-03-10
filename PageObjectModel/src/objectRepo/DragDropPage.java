package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragDropPage {

	WebDriver d;
	public DragDropPage(WebDriver driver) {
		this.d = driver;
	}
	
	By dragPageLink = By.xpath("//a[contains(text(),'Draggable')]");
	public WebElement dr()
	{
		return d.findElement(dragPageLink);
	}
	
	By dragEl= By.xpath("//*[@id='draggable']");
	public WebElement ddm() {
		
		 return d.findElement(dragEl);
	}
	
	By frame= By.xpath("//*[@class='demo-frame']");
	public WebElement ff()
	{
		return d.findElement(frame);
	}
	
	By drop=By.xpath("(//a[contains(text(),'Draggable')]/following::li)[1]");
	public WebElement dropTest()
	{
		return d.findElement(drop);
	}
	
	
}
