package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test2 extends testBase {
	
	searchPage object;   //create an object from searchPage to use its variables
	
	@Test(priority = 1)
	public void getTitle()
	{
		object = new searchPage(driver);
		String keyword = "Apple";
		object.searchBar.sendKeys(keyword);  // search for "Apple" in the search area
		object.searchBar.sendKeys(Keys.ENTER); // hits enter
		
		Assert.assertTrue(driver.getTitle().contains("keyword")); // use assertion, so if the title has the keyword, it will be true and the test pass, otherwise it will be false
		
	}

}
