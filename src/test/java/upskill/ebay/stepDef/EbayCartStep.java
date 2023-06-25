package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartAction;

public class EbayCartStep {
	
	EbayCartAction EbayCartActionsobj = new EbayCartAction();
	
 
	@When("^Select Size$")
	public void select_Size() throws Throwable {
		EbayCartActionsobj.switchNewWindow();
		EbayCartActionsobj.selectSizeType();
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		EbayCartActionsobj.selectMenSize();
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		EbayCartActionsobj.selectShade();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		EbayCartActionsobj.enterQuantity();
	}
	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionsobj.addToCart();
	}
}
