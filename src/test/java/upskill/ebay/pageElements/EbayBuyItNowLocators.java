package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayBuyItNowLocators {

		//Shoes Color
		@FindBy(xpath="//select[@aria-label='Please select a Color']")
		public WebElement ddColor;
		
		//Shoes Men Size
		@FindBy(xpath="//select[@aria-label='Please select a Size']")
		public WebElement ddSize;
			
		//Shoes Quantity
		@FindBy(xpath="//input[@id='qtyTextBox']")
		public WebElement txtbxQty;
		
		//Buy It Now
		@FindBy(xpath="//a[@data-testid='ux-call-to-action']")
		public WebElement btnBuyItNow;
	
}
