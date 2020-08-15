package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import starter.navigation.OnthegoHomepage;
import starter.search.Subscribtionactions;

public class SubscribtionStepdefinitions {
	@Shared
	OnthegoHomepage onthegohomepage;

	@Steps
	Subscribtionactions subscribtionActions;

	@Given("clicked Subscribtion tab and clicked add new subscribtion")
	public void clicked_Subscribtion_tab_and_clicked_add_new_subscribtion() {
		subscribtionActions.clicksubscribtion();
	}

	@When("filled plan id {int} , plan name {string} ,card category {string} ,default plan {string} , Subscribtion period {int} , Default rate {int} and clicked Add subscribtion")
	public void subcribtioninfo(Integer planid, String planname, String Cardcat, String defaultplan, Integer subperiod,
			Integer defaultrate) {
		// Write code here that turns the phrase above into concrete actions
		subscribtionActions.Filladdsubscribtioninfo(planid, planname, Cardcat, defaultplan, subperiod, defaultrate);
	}

	@When("Add plan id {int} for card {string} , payment ref no {string}")
	public void Addsubscribtiontocard(int planid, String card, String payref) {
		subscribtionActions.Addsubscribtiontocard(planid, card, payref);
		
	}
	
	@Then("user shoudl see message {string} when adding subscribtion to user card")
	public void verifyresponsesubcribtion(String message) {
		subscribtionActions.Verifysubscribtionsystemprompt(message);
	}

	@Then("user should see prompt message {string} in subscribtion popup")
	public void use_should_see_prompt_message_in_subscribtion_popup(String message) {
		subscribtionActions.Verifysystemprompt(message);
	}

}
