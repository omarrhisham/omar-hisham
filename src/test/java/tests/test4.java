package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test4 extends testBase {
	
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validateCaseSensitivity()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("samsung");	 //input "Samsung" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		String first = object.ResultNo.getText();
		
		String[] splited =first.split(" "); // these two steps to get the number of results only
		first = splited[1];

		driver.navigate().back();
		
		object.searchBar.sendKeys("SAMSUNG");	 //input "Samsung" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		String second = object.ResultNo.getText();
		
		String[] splited_B = second.split(" ");  // these two steps to get the number of results only
		second = splited_B[1];
		
		Assert.assertTrue(first.matches(second));  // if two keywords are with the same #of results; then return true
		System.out.println("Google Search is not a case sensitive search engine");
		
		
		
		
	}

}
