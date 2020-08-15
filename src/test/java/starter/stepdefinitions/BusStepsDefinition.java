package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.search.Busactions;

public class BusStepsDefinition {

	@Steps
	Busactions busActions;
	@When("Create new bus type bus type name {string} , seating capacity: {int} , standing capacity: {int}")
	public void Addbustype(String Bustypename, Integer seatcapacity, Integer standcapacity) {
	    // Write code here that turns the phrase above into concrete actions
		busActions.Fillbustypeinfo(Bustypename, seatcapacity, standcapacity);
	}

	@Then("Bus type creation response message {string}")
	public void bustypecreationresponse(String message) {
		busActions.Verifybustyperesponse(message);
	}

	@When("create bus service, bus service name {string}")
	public void bus_service_name(String busName) {
	    busActions.Fillbusserviceinfo(busName);
	}
	@Then("Bus service creation response message {string}")
	public void busservicecreationresponse(String message) {
		busActions.Verifybusserviceresponse(message);
	}

	@Given("user boards in bus with service id {int} from stop id {int} with card {string}")
	public void userboardbus(Integer serviceid, Integer stopid, String cardnum) {
		busActions.Fillbustapcardinfo(serviceid, stopid, cardnum);
	}

	@When("user tap the card to board")
	public void user_tap_the_card_to_board() {
	   busActions.UserTapin();
	}

	@When("user tap the card to alight")
	public void user_tap_the_card_to_alight() {
	    // Write code here that turns the phrase above into concrete actions
		busActions.UserTapout();
	}
	@Then("Bus board or alight response message {string}")
	public void bustapinresponse(String message) {
		busActions.Verifybustapresponse(message);
	}

}
