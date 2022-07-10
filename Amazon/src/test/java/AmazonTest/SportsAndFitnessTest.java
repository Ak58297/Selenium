package AmazonTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pageObjects.SpotsAndfitnessPage;

public class SportsAndFitnessTest extends HelloSignInTest {
	
	@Test(dependsOnMethods ={"HelloSignInTestMethod"})
	public void SportsAndFitnessTestMethod()
	{
		SpotsAndfitnessPage fp=new SpotsAndfitnessPage();
		fp.getSearchDropdownBox().isDisplayed();
		fp.getSearchDropdownBox().click();
		fp.getComputerFromTheDropdown();
		fp.openHyperlinkInNewTab();
		try {
			fp.GetWindowHandlesTitle();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

