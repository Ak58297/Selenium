package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseTest.DriverInitialization;

;

public class HomePage extends DriverInitialization {
	
	public static WebDriver driver;
	public static Actions a;
	
	By AmazonLabel= By.xpath("//a[@aria-label='Amazon']");
	By DontChangePopUp= By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");
	By SignIn=By.xpath("((//*[contains(text(),'Hello, Sign in')])[1]/../..)");
	By SignInButton=By.xpath("(//*[(text()='Sign in')])[1]");
	By CartValue=By.xpath("(//span[text()='0'])[1]");
	By LanguageChange=By.xpath("//a[@id='icp-nav-flyout']");
	By DefaultCurrency=By.xpath("//span[contains(text(),' US Dollar (Default)')]");
	By IndianCurrency=By.xpath("//li[@tabindex='0' and @class='a-dropdown-item' and @id='INR']");
	By SaveChangesForCurrency=By.xpath("(//*[contains(text(),'Save Changes')])[2]");
	By OnAmazonPageText=By.xpath("(//div[@id='desktop-banner-stripe']//div//span)");
	
	
	
	public HomePage(WebDriver driver)
	{
		HomePage.driver=driver;
	}
	
	public WebElement DontChangePOPUP() {
		return driver.findElement(DontChangePopUp);
	}
	
	public WebElement SignInMethod() {
		return driver.findElement(SignIn);
	}
	
	public void moveHoverClickOnSignButton() throws InterruptedException
	{
	a=new Actions(driver);
	 a.moveToElement(SignInMethod()).build().perform();
	Thread.sleep(5000l);
	 
	 
	 driver.findElement(SignInButton).click();
	 //a.moveToElement(driver.findElement(SignInButton)).click().build().perform();
	}
	
	public WebElement AmazonLableMethod() {
		// TODO Auto-generated method stub
		return driver.findElement(AmazonLabel);
	}
	public void NavigateToHomePage()
	{
		driver.navigate().back();
	}
	
	public String CartValueTobeZero()
	{
		return driver.findElement(CartValue).getText();
	}
	
	public void ChangeCurrency() 
	{
		try
		{
			driver.findElement(LanguageChange).click();
			driver.findElement(DefaultCurrency).click();
			driver.findElement(IndianCurrency).click();
			
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(6));
			w.until(ExpectedConditions.elementToBeClickable(SaveChangesForCurrency)).click();
			driver.findElement(SaveChangesForCurrency).click();
		}
		catch(ElementClickInterceptedException e)
		{
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(SaveChangesForCurrency));
			
		}
		
		
		
		
		
	}
	
	public String OnAmazonPagelongtext()
	{
		return driver.findElement(OnAmazonPageText).getText();
		}
	
	public void compareTwoStringOnHomePage()
	{
		
		String s1=OnAmazonPagelongtext();
		String s2=p.getProperty("LongTextOnHomePage");
		Assert.assertEquals(s2, s1,"Text did not match as it is updated or removed");
		
	}

}
