package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pages.searchPage;

public class testCase1 extends testBase{
	
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void EnterForSearch()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("how to play estimation?");	 //input "how to play estimation?" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
	}
	
	@Test(priority = 2)
	public void PressSearchButton() 
	{
		object = new searchPage(driver);
		driver.navigate().back(); 		//go back to google search page to test the search button
		
		object.searchBar.sendKeys("how to drive a car?");  //input "car" in search box
		wait.until(ExpectedConditions.visibilityOf(object.search)); 	//wait until the button is visible
		object.search.click();   //click on search button
		
	}
	
	
}
