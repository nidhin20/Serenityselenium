package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.navigation.OnthegoHomepage;
import starter.search.Loginactions;
import starter.search.SearchFor;
import starter.search.SearchForm;
import starter.search.SearchResult;

public class Loginstepdefinition {
	@Steps
	NavigateTo navigateTo;

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Steps
	SearchFor searchFor;

	@Steps
	Loginactions loginActions;

	@Steps
	SearchResult searchResult;

	@Shared
	OnthegoHomepage onthegohomepage;
	Actor user;

	@Given("user is in home page")
	public void Homepage() {
		navigateTo.ToLoginpage();
	}

	@Given("user in sigup page")
	public void Signuppage() {
		loginActions.singupbuttonclicked();

	}

	@When("filled emailid: {string} , password: {string} ,name: {string} ,phonenumber: {string} , Date {string}  and submit")
	public void Fillusersignupinfo(String emailid, String password, String name, String phoneno, String dateofbirth) {
		onthegohomepage.waitForAngularRequestsToFinish();
		loginActions.Fillsignupinfo(emailid, name, phoneno, dateofbirth, password);
	}

	@Then("User get response for Signup message {string}")
	public void Signupresponse(String message) {
		loginActions.checkerrormessage(SearchForm.REGISTER_ERRORMESSAGE, message);

	}

	@When("login with username : {string} ,password: {string}")
	public void user_click_on_login(String username, String password) {
		user = Actor.named(username);
		onthegohomepage.waitForAngularRequestsToFinish();
		loginActions.Filllogininfoanflogin(username, password);
	}

	@Then("user should be redirected to {string}")
	public void user_should_be_redirected_to(String Checkedirection) {
		navigateTo.Checkredirection(Checkedirection);

	}

	@Then("user prompts with error message {string}")
	public void usergetserrormessage(String message) {
		loginActions.checkerrormessage(SearchForm.LOGIN_ERROR_MSG, message);

	}

	@Given("user loged in with username : {string} ,password: {string}")
	public void Loggedinuser(String username, String password) {
		navigateTo.ToLoginpage();
		loginActions.Filllogininfoanflogin(username, password);
	}
}
