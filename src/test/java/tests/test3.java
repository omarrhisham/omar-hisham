package tests;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.searchPage;

public class test3 extends testBase {
	
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validateResultsNum()
	{
		object = new searchPage(driver); 
		
		object.searchBar.sendKeys("car");	 //input "car" in search box
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
		System.out.println(object.ResultNo.getText()); //print the value at the console
		
		Assert.assertNotNull("Does not appear", object.ResultNo.getText());// if the number is found return true and pass, else show the message in the first parameter
	}

}
