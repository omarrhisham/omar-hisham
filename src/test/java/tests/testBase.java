package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeSuite
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/omar/eclipse-workspace/google/drivers/chromedriver 2");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/en");
	}
	@AfterSuite
	public void closeDriver()
	{
		driver.close();
	}
	
}
