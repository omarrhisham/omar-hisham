package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test5 extends testBase {
	
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void verifyCorrection()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("aoole");	 //input "aoole" instead of "apple" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hits enter
		
		System.out.println(object.corrector.getText());  // print out the result at the console
		
		Assert.assertEquals(object.corrector.getText(), "apple");  //passed if true; failed if the actual does not equall the expected
		Assert.assertTrue(object.corrector.isEnabled()); // to make sure the link is enabled
	}

}
