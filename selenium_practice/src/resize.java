import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@id='details-button']")).click();
		//driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		//Thread.sleep(6000);
		Actions a=new Actions(driver);
		driver.switchTo().frame(driver .findElement(By.xpath("//*[@class='demo-frame']")));
		String as=driver.findElement(By.xpath("//*[text()='Resizable']")).getText();
		System.out.println(as);
		
		WebElement e=driver.findElement(By.xpath("(//*[@id='resizable']//div)[3]"));
		a.dragAndDropBy(e, 400, 100).build().perform();
		
		//a.dragAndDropBy(e,400, 100).perform();
		
		
		

	}

}
