import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement staticDropdown=driver.findElement(By.xpath("(//*[text()='Adults']/following::select)[1]"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
		
		WebElement staticDropdown1=driver.findElement(By.xpath("(//*[text()='Adults']/following::select)[2]"));
		Select dropdown1=new Select(staticDropdown1);
		dropdown1.selectByIndex(2);
		
		WebElement staticDropdown2=driver.findElement(By.xpath("(//*[text()='Adults']/following::select)[3]"));
		Select dropdown2=new Select(staticDropdown2);
		dropdown2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("(//*[text()='Depart on']/following::button)[1]")).click();
		driver.findElement(By.xpath("//*[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']")).click();

	}

}
