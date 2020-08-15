package starter.search;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import starter.navigation.OnthegoHomepage;
import org.openqa.selenium.By;
public class Cardactions extends UIInteractionSteps {
	@Shared
	OnthegoHomepage onthegohomepage;

	@Step("Link card to user")
	public void FIlllinkcardinfo(String card) {

		$(SearchForm.HOME_LINKCARD_MORE).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.HOME_LINKCARD).clear();
		$(SearchForm.HOME_LINKCARD).type(card);
		$(SearchForm.HOME_LINKCARD_BUTTON).click();

	}

	@Step("Validate response message")
	public void checkerrormessage(String expectedmessage) {
		assertThat($(SearchForm.HOME_LINKCARD_ERROR).getText(), equalTo(expectedmessage));

	}
	public void findcard(String card) {
		assertThat(find(By.xpath("//*[text() = '"+ card +"']")).getTextValue(),equalTo(card));
	}
	public void checkcardnotexist(String card) {
		assertThat(find(By.xpath("//*[text() = '"+ card +"']")).isPresent(),equalTo(false));
	}
	public void checkcardexists(String card) {
		assertThat(find(By.xpath("//*[text() = '"+ card +"']")).isPresent(),equalTo(true));
	}
	@Step("Delink the card")
    public void delinkcard(String card) {
       find(By.xpath("//*[text() = '"+ card +"']/..//button[text()='De-Link Card']")).click();
      
    }
                
	@Step("Link card to user")
	public void Dilinkcard(String card) {

		$(SearchForm.HOME_LINKCARD_MORE).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.HOME_LINKCARD).clear();
		$(SearchForm.HOME_LINKCARD).type(card);
		$(SearchForm.HOME_LINKCARD_BUTTON).click();

	}
}
