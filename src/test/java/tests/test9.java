package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test9 extends testBase  {

	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void validateResponse()
	{
		object = new searchPage(driver); 
		
		String keyword = "car";
		object.searchBar.sendKeys(keyword);	 //search for the above keyword
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
		int counter = 0;
		for(int i=0; i < object.headers.size(); i++) 
		{
			//System.out.println(object.headers.get(i).getText());
			if(object.headers.get(i).getText().contains(keyword)) //every line have the keyword, add 1 to counter
			{
				counter++;
			} 
			
		} System.out.println(keyword+ " is repeated "+counter+" times in the search!"); //if the word repeated more than once, it means the search functionility is running well
		Assert.assertNotSame(counter, 0); //if it is not equal to zero, then it's passed
		
	} 
}
