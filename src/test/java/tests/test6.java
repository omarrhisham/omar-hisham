package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test6 extends testBase {

	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validateHomePage()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("");	 //input "car" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
		Assert.assertTrue(object.home.isDisplayed()); // return true if we are in the same page
	}
}
