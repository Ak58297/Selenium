package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseTest.DriverInitialization;
import baseTest.NavigateToURL;

public class SpotsAndfitnessPage extends NavigateToURL {

	By SearchDropdownBox = By.id("searchDropdownBox");
	By TodaysDeal = By.xpath("//a[contains(text(),\"Today's Deals\")]");
	By CustomerService = By.xpath("(//a[contains(text(),\"Customer Service\")])[1]");
	By Registry = By.xpath("(//a[contains(text(),\"Registry\")])[1]");
	By GiftCards = By.xpath("(//a[contains(text(),\"Gift Cards\")])[1]");

	public WebElement getSearchDropdownBox() {
//		driver.findElement(SearchDropdownBox).isDisplayed();
		return driver.findElement(SearchDropdownBox);
	}
//	public void getComputerFromTheDropdown()
//	{
//		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
//		  dropdown.selectByValue("search-alias=computers-intl-ship");
//		driver.findElement(By.xpath("//option[@value='search-alias=computers-intl-ship']")).isSelected();
//	}

	// select dropdown without using Select class

	public void getComputerFromTheDropdown() {
		List<WebElement> allOptions = driver.findElements(By.xpath("(//select[@id='searchDropdownBox']/option)"));

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains("Computers")) {
				allOptions.get(i).click();
			}

		}

	}

	public void openHyperlinkInNewTab() {
		String Ctrl_click = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(TodaysDeal).sendKeys(Ctrl_click);
		driver.findElement(CustomerService).sendKeys(Ctrl_click);
		driver.findElement(Registry).sendKeys(Ctrl_click);
		driver.findElement(GiftCards).sendKeys(Ctrl_click);

	}
	
	public void GetWindowHandlesTitle() throws InterruptedException
	{
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String ParentWindow=driver.getWindowHandle();
		
		while(it.hasNext())
		{	
			//it.next();
			driver.switchTo().window(it.next());
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
	}

	
}
