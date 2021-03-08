package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test12 extends testBase {

	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validatePageMaintainability()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("best nutrition plans for athletes");	 //search about anything
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		String temp = driver.getTitle().toString(); // put the current page title in this temp variable
		
		object.Firstlink.click();  //click on the first link, and then go back to search page
		driver.navigate().back();
		String temp2 = driver.getTitle().toString();   // put the page title in this temp2 to compare the 2 temps if they are the some or something has changed
		
		Assert.assertEquals(temp2, temp); //if they're same -> passed, else -> failed and pass false.
		
		
	}
}
