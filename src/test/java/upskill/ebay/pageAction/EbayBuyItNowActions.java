package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayBuyItNowLocators;
import upskill.utilities.SetupDrivers;

public class EbayBuyItNowActions {

	EbayBuyItNowLocators EbayBuyItNowLocatorsObj;
	
	public EbayBuyItNowActions(){
		EbayBuyItNowLocatorsObj = new EbayBuyItNowLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayBuyItNowLocatorsObj);
	}
	public void switchNewWindow(){
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhandle);
		}
	} 
	public void selectColor() throws Exception{
		Thread.sleep(3000);
		Select dropDownObj = new Select(EbayBuyItNowLocatorsObj.ddColor);
		dropDownObj.selectByIndex(0);
		Thread.sleep(3000);
	}
	public void selectSize() throws Exception{
		Thread.sleep(3000);
		Select dropDownObj = new Select(EbayBuyItNowLocatorsObj.ddSize);
		dropDownObj.selectByValue("10");
		Thread.sleep(3000);
	}
	public void selectAmount() throws Exception{
		Thread.sleep(3000);
		EbayBuyItNowLocatorsObj.txtbxQty.clear();
		EbayBuyItNowLocatorsObj.txtbxQty.sendKeys("2");
		Thread.sleep(3000);
	}
	public void buyItNow() throws Exception{
		Thread.sleep(3000);
		EbayBuyItNowLocatorsObj.btnBuyItNow.click();
		Thread.sleep(3000);
	}
}
