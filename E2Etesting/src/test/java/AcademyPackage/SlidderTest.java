package AcademyPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.Slidder;
import resources.BaseClass;

public class SlidderTest extends BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void Initializedriver() throws IOException
	{
		driver=InitializeDriver();
		
	}
	
	
	@Test
	 public void TestSlidderPage() throws IOException
	 {
		
		 driver.get("https://jqueryui.com/");
		 
		 Slidder s=new Slidder(driver);
		 s.SlidderElements().click();
		 Assert.assertTrue(s.getsliderHeading().isDisplayed());
		 Assert.assertTrue(false);
		 //find number of frame size
		 int size=driver.findElements(By.xpath("//iframe")).size();
		 System.out.print(size);
		 driver.switchTo().frame(0);
		 Actions a=new Actions(driver);
		 a.dragAndDropBy(s.getsliderbutton(), 30, 0).build().perform();
		
		 System.out.println( s.getsliderbutton().getAttribute("style"));
		 
		 driver.switchTo().defaultContent();
		 
	 }
	

	@AfterTest()
	public void closeBrowser()
	{
		driver.close();
	}
	

}
