package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test8 extends testBase {

	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void verifyMultiLingual()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("Digital Egypt");	 //input "Digital Egypt" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		Assert.assertNotNull(object.ResultNo.getText()); //validate the search results
		
		driver.navigate().back(); // back to search home page
		
		object.searchBar.sendKeys("مصر الرقمية");	 //input "مصر الرقمية" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		Assert.assertNotNull(object.ResultNo.getText()); //validate the search results
		
	}
}
