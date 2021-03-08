package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.searchPage;

public class test10 extends testBase {
	searchPage object; //create an object from searchPage to use its variables

	@Test(priority = 1)
	public void verifyLocalization()
	{
		object = new searchPage(driver); 
		
		
		object.searchBar.sendKeys("mcdonalds");	 //search for a brand has branches in Egypt to test search localization, let's try "mcdonalds"
		object.searchBar.sendKeys(Keys.ENTER); 		//hit enter
		
		int counter = 0;
		for(int i=0; i < object.headers.size(); i++) 
		{
			//System.out.println(object.headers.get(i).getText());
			if(object.headers.get(i).getText().contains("Egypt")) //every line have the keyword, add 1 to counter
			{
				counter++;
			} 
			
		} System.out.println("Egypt is repeated "+counter+" times in the search!"); //if the word "Egypt" is repeated at least once, so the engine done localization filter
		
		
	} 

}
