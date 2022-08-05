package sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[contains(text(),'Top Deals')]")).click();
		
		
		//String ParentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		while(i.hasNext())
		{
		driver.switchTo().window(i.next());
		
		}
		//false line added
		driver.findElement(By.xpath("//*[@class='sort-icon sort-descending']")).click();
		List<WebElement> items=driver.findElements(By.xpath("//tr/td[1]"));
		
		
//		//Extract all the elements present in the list using ArrayList and for loop
//		String item = null;
//		ArrayList<String> itemd=new ArrayList<String>();
//		for(int j=0;j<items.size();j++)
//		{
//		item=items.get(j).getText();
//		itemd.add(item);		
//		}
//		System.out.println(itemd);
		
		//Extract all the elements present in the list using Stream
		List<String> StreamList=items.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> SortedList1=StreamList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(StreamList, SortedList1);

	}

	

}
