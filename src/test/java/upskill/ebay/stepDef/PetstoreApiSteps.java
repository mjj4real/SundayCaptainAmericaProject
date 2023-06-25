package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.PetstoreRestAssuredActions;

public class PetstoreApiSteps {
	
	PetstoreRestAssuredActions PetstoreRestAssuredActionsobj = new PetstoreRestAssuredActions();

	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		PetstoreRestAssuredActionsobj.CreatePet();
	}

	@Given("^Get pet$")
	public void get_pet() throws Throwable {
		PetstoreRestAssuredActionsobj.getPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
		PetstoreRestAssuredActionsobj.updatePet();
	}

	@When("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetstoreRestAssuredActionsobj.deletePet();
	}
}
