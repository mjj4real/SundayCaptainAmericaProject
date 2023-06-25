package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	//Shirt Size Type
	@FindBy(xpath="//select[@aria-label='Please select a Size Type']")
	public WebElement ddSizeType;
	
	//Shirt Men Size
	@FindBy(xpath="//select[@selectboxid='1001']")
	public WebElement ddMenSize;
		
	//Shirt Shade
	@FindBy(xpath="//select[@aria-label='Please select a Shade']")
	public WebElement ddShirtShade;
		
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	//Add to Cart
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement btnAddCart;
}
