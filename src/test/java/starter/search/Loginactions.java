package starter.search;

import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import starter.navigation.OnthegoHomepage;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
public class Loginactions extends UIInteractionSteps {
	
	@Shared
	OnthegoHomepage onthegohomepage;
    @Step("Login information filled")
    public void Filllogininfoanflogin(String username, String password) {
        $(SearchForm.LOGIN_EMAIL).clear();
        $(SearchForm.LOGIN_EMAIL).type(username);
        $(SearchForm.LOGIN_PASSWORD).clear();
        $(SearchForm.LOGIN_PASSWORD).type(password);
        $(SearchForm.LOGIN_LOGIN_BUTTON).click();
        
    }
    @Step("Sigup button clicked")
    public void singupbuttonclicked() {
        $(SearchForm.HOME_SIGNUP_BUTTON).click();
        
    }
    @Step("User signup information filled")
    public void Fillsignupinfo(String emailid, String name,String phoneno, String dateofbirth, String password) {
    	
    	$(SearchForm.REGISTER_USERNAME).clear();
        $(SearchForm.REGISTER_USERNAME).type(name);
        $(SearchForm.REGISTER_EMAIL).clear();
        $(SearchForm.REGISTER_EMAIL).type(emailid);
        $(SearchForm.REGISTER_PHONENO).clear();
        $(SearchForm.REGISTER_PHONENO).type(phoneno);
        $(SearchForm.REGISTER_DOB).clear();
        $(SearchForm.REGISTER_DOB).type(dateofbirth);
        $(SearchForm.REGISTER_PASSWORD).clear();
        $(SearchForm.REGISTER_PASSWORD).type(password);
        $(SearchForm.REGISTER_BUTTON).click();
        
        
    }
    @Step("Validate response message")
    public void checkerrormessage(By control,String expectedmessage) {
    	assertThat($(control).getText(),equalTo(expectedmessage));
    	
    }
    
}
