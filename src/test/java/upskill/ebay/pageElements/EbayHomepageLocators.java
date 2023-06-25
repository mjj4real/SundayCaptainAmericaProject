 package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
	//My Ebay Link
		@FindBy(xpath="//a[@title='My eBay']")
		public WebElement linkMyEbay;
	
	//Click Summary
	@FindBy(xpath="//a[contains(text(),' Summary')]")
	public WebElement linkSummary;
}
