package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import starter.navigation.OnthegoHomepage;
import starter.search.Cardactions;

public class CardStepDefinitions {
	@Shared
	OnthegoHomepage onthegohomepage;
	@Steps
	Cardactions cardAction;
	
	@Then("clicked on Link more cards and added card {string}")
	public void filllinkcardinfo(String cardno) {
		onthegohomepage.waitForAngularRequestsToFinish();
		cardAction.FIlllinkcardinfo(cardno);

	}
	
	@Then("user should get message {string}")
	public void checkresponse(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		cardAction.checkerrormessage(message);
	}
	@When("user click on delink card {string}")
	public void delinkcard(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		cardAction.findcard(message);
		cardAction.delinkcard(message);
	}
	@Then("Card {string} should be removed from list")
	public void checkcardremoved(String card) {
		onthegohomepage.waitForAngularRequestsToFinish();
		cardAction.checkcardnotexist(card);
	}
	@Then("Card {string} should be the list")
	public void Verifycardinlist(String card) {
		onthegohomepage.waitForAngularRequestsToFinish();
		cardAction.checkcardexists(card);
	}
}
