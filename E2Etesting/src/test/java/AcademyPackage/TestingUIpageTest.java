package AcademyPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.HomePage;
import pageObjectModel.Sortable;
import resources.BaseClass;


public class TestingUIpageTest extends BaseClass{
	
	public WebDriver driver;
	
	@BeforeTest
	public void Initializedriver() throws IOException
	{
		driver=InitializeDriver();
		
	}
	
	
	@DataProvider
	public Object[][] getLinkData()
	{
		Object[][] ob=new Object[1][1];
		ob[0][0]="https://jqueryui.com/";
		return ob;
	}
	
	@Test(dataProvider="getLinkData")
	public void homePage(String url) throws IOException
	{
		
		driver.get(url);
		HomePage hp=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(hp.getmhover()).perform();
		hp.getmhovermethod().click();
		driver.navigate().back();
	}
	
	
	@Test
	public void sortPage()
	{
		Sortable s=new Sortable(driver);
		s.SortLink().click();
	}


	
	@AfterTest()
	public void closeBrowser()
	{
		driver.close();
	}
	
}
