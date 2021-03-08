package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends pageBase {

	public searchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	public
	WebElement searchBar;
	
	@FindBy(css = "input.gNO89b")
	public
	WebElement search;
	
	@FindBy(id = "result-stats")
	public
	WebElement ResultNo;
	
	@FindBy(tagName = "b")
	public 
	WebElement corrector;
	
	@FindBy(xpath = "//div[contains(@id,'logo')]")
	public
	WebElement home;
	
	@FindBy(tagName = "p")
	public
	WebElement irrelavent;
	
	@FindBy(tagName = "span")
	public
	List<WebElement> headers;
	
	@FindBy(tagName = "li")
	public
	List<WebElement> suggestions;
	
	@FindBy(css = "div.cfxYMc.JfZTW.c4Djg.MUxGbd.v0nnCb")
	public
	WebElement Firstlink;

}
