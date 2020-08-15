package starter.search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import starter.navigation.OnthegoHomepage;

public class Subscribtionactions extends UIInteractionSteps {

	@Shared
	OnthegoHomepage onthegohomepage;

	@Step("Click subscribtion tab and add subscribtion")
	public void clicksubscribtion() {
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_SUBCRIBTION_TAB).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_SUBCRIBTION).click();
		onthegohomepage.waitForAngularRequestsToFinish();
	}
	@Step("Add new subscribtion")
	public void Filladdsubscribtioninfo(Integer planid, String planname, String Cardcat, String defaultplan, Integer subperiod, Integer defaultrate) {

	
		$(SearchForm.ADMIN_SUBSCRIBTION_PLAN).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_PLANNAME).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_CARDCAT).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_DEFAULTPLAN).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_PERIOD).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_RATE).clear();
		$(SearchForm.ADMIN_SUBSCRIBTION_PLAN).type(String.valueOf(planid));
		$(SearchForm.ADMIN_SUBSCRIBTION_PLANNAME).type(planname);
		$(SearchForm.ADMIN_SUBSCRIBTION_CARDCAT).type(Cardcat);
		$(SearchForm.ADMIN_SUBSCRIBTION_DEFAULTPLAN).type(defaultplan);
		$(SearchForm.ADMIN_SUBSCRIBTION_PERIOD).type(String.valueOf(subperiod));
		$(SearchForm.ADMIN_SUBSCRIBTION_RATE).type(String.valueOf(defaultrate));
		$(SearchForm.ADMIN_SUBCRIBTION_ADD).click();

	}
	@Step("Verify the system prompt")
	public void Verifysystemprompt(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		assertThat(
		$(SearchForm.ADMIN_SUBSCRIBTION_ERROR).getText(), equalTo(message));
	
	}
	@Step("Verify the system prompt")
	public void Verifysubscribtionsystemprompt(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		assertThat(
		$(SearchForm.ADMIN_CARDSUB_SUBERROR).getText(), equalTo(message));
	
	}
	@Step("Add subscribtion to card")
	public void Addsubscribtiontocard(Integer planid, String cardnum,String payref) {

		find(By.xpath("//*[text() = '"+ cardnum +"']/..//*[text()='Add Subscribtion']")).click();

		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_CARDSUB_PLANID).clear();
		$(SearchForm.ADMIN_CARDSUB_CARDNUM).clear();
		$(SearchForm.ADMIN_CARDSUB_PAYREF).clear();
		$(SearchForm.ADMIN_CARDSUB_PLANID).type(String.valueOf(planid));
		$(SearchForm.ADMIN_CARDSUB_CARDNUM).type(cardnum);
		$(SearchForm.ADMIN_CARDSUB_PAYREF).type(payref);
		$(SearchForm.ADMIN_CARDSUB_ADD).click();

	}
	
}
