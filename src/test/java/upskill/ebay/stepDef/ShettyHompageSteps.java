package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.ShettyHomepageActions;

public class ShettyHompageSteps {
	ShettyHomepageActions ShettyHomepageActionsObj = new ShettyHomepageActions();

	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		ShettyHomepageActionsObj.loadShetttyHompage();
	}

	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		ShettyHomepageActionsObj.clickFrame();
	}

	@Then("^It should reload iframe homepage$")
	public void it_should_reload_iframe_homepage() throws Throwable {
		ShettyHomepageActionsObj.verifyShettyHome();
	}
}
