package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayBuyItNowActions;

public class EbayBuyItNowSteps {
	EbayBuyItNowActions EbayBuyItNowActionsObj = new EbayBuyItNowActions();

	@When("^Select color$")
	public void select_color() throws Throwable {
		EbayBuyItNowActionsObj.switchNewWindow();
		EbayBuyItNowActionsObj.selectColor();
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		EbayBuyItNowActionsObj.selectSize();
	}

	@When("^Select amount$")
	public void select_amount() throws Throwable {
		EbayBuyItNowActionsObj.selectAmount();
	}

	@Then("^Add to buy it now$")
	public void add_to_buy_it_now() throws Throwable {
		EbayBuyItNowActionsObj.buyItNow();
	}

}
