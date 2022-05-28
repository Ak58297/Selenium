package AmazonTest;

import org.testng.annotations.Test;

import baseTest.NavigateToURL;
import pageObjects.HelloSignInPage;

public class HelloSignInTest extends NavigateToURL {
	@Test
	public void HelloSignInTestMethod() throws Throwable
	{
		URL();
		
		HelloSignInPage hp=new HelloSignInPage();
		hp.getAllButton().click();
		hp.Wait();
		hp.getSeeAllButton1().click();
		hp.Wait();
		hp.ScrollAllTab();
		hp.Wait();
		hp.getSportsItem().click();
		hp.getSportsAndFitness().click();
		
		
	}

}
