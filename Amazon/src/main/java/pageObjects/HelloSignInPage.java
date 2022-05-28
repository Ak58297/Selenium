package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseTest.DriverInitialization;

public class HelloSignInPage extends DriverInitialization {
	By Allbutton = By.xpath("//a[@id=\"nav-hamburger-menu\"]");
	By SportsItem = By.xpath("(//*[contains(text(),'Sports and Outdoors')])[1]");
	By SportsItem2 = By.xpath("(//*[contains(text(),'Sports and Outdoors')])[2]");
	By SeeAllButton1=By.xpath("(//div[contains(text(),'see all')])[1]");
	By SportsAndFitness=By.xpath("(//*[contains(text(),'Sports & Fitness')])[1]");
	
	//By ScrollTab=By.xpath("(//*[@id=\"hmenu-content\"]/ul)[1]");

	public WebElement getAllButton() {
		return driver.findElement(Allbutton);
	}
	public WebElement getSportsItem() {
		return driver.findElement(SportsItem);
	}
	
	public void ScrollAllTab()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#hmenu-content > ul.hmenu.hmenu-visible\").scrollTop=900");
	}
	public WebElement getSeeAllButton1() {
		return driver.findElement(SeeAllButton1);
	}
	public void Wait() throws InterruptedException
	{
		Thread.sleep(3000l);
	}
	public WebElement getSportsAndFitness()
	{
		return driver.findElement(SportsAndFitness);
	}
	

}
