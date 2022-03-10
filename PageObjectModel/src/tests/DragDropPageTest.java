package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepo.DragDropPage;
import objectRepo.HomePage;

public class DragDropPageTest {
	
@Test
public void dragDropTest()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	HomePage hp=new HomePage(driver);
	System.out.println(hp.HomeTexts().getText());
	
	//click drag page
	DragDropPage dd=new DragDropPage(driver);
	dd.dr().click();
	
	//switch to frame
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	
	Actions a=new Actions(driver);
	a.dragAndDropBy(dd.ddm(), 10, 50).build().perform();
	
	//default
	driver.switchTo().parentFrame();
	
	
	
	
	
	
	
	
}

}
