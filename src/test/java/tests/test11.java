package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.searchPage;

public class test11 extends testBase {
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void verifyAutoSuggestion()
	{
		object = new searchPage(driver); 
		
		String keyword = "mac";
		object.searchBar.sendKeys(keyword);	 //search for the above keyword
		
		
		for(int i=0; i < object.suggestions.size(); i++) 
		{
			System.out.println(object.suggestions.get(i).getText()); //get all suggestion at the console
			
			if(object.headers.get(i).getText().contains(keyword)) //check if the suggestions have the searched word or not
			{
				Assert.assertTrue(object.headers.get(i).getText().contains(keyword));
				
			} 
			
		}
		
		
	} 

}
