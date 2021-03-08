package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test7 extends testBase {
	
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validateIrrelaventValue()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("++++++++");	 //enter irrelavent search data in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
		System.out.println(object.irrelavent.getText()); // Print out the result at the console
		
		Assert.assertTrue(object.irrelavent.getText().contains("did not match any documents")); //passed if true
		
	}
}
