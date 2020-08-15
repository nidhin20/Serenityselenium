package starter.search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import starter.navigation.OnthegoHomepage;

public class Busactions extends UIInteractionSteps{

	@Shared
	OnthegoHomepage onthegohomepage;

	@Step("Fill bus type informations")
	public void Fillbustypeinfo(String Bustypename, Integer seatcapacity, Integer standcapacity) {
		$(SearchForm.ADMIN_BUSTYPE).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSTYPE_NAME).clear();
		$(SearchForm.ADMIN_BUSTYPE_NAME).type(Bustypename);
		$(SearchForm.ADMIN_BUSTYPE_SEAT).clear();
		$(SearchForm.ADMIN_BUSTYPE_SEAT).type(String.valueOf(seatcapacity));
		$(SearchForm.ADMIN_BUSTYPE_STAND).clear();
		$(SearchForm.ADMIN_BUSTYPE_STAND).type(String.valueOf(standcapacity));
		$(SearchForm.ADMIN_BUSTYPE_ADD).click();

	}
	@Step("Verify bus type response")
	public void Verifybustyperesponse(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		assertThat($(SearchForm.ADMIN_BUSTYPE_ERROR).getText(),equalTo(message));
	}
	@Step("Fill bus service informations")
	public void Fillbusserviceinfo(String busservicename) {
		$(SearchForm.ADMIN_BUSSERVICE_TAB).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSSERVICE).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSSERVICE_NAME).clear();
		$(SearchForm.ADMIN_BUSSERVICE_NAME).type(busservicename);
		$(SearchForm.ADMIN_BUSSERVICE_ADD).click();

	}
	@Step("Verify bus service response")
	public void Verifybusserviceresponse(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		assertThat($(SearchForm.ADMIN_BUSSERVICE_ERROR).getText(),equalTo(message));
	}
	@Step("Fill bus tap card informations")
	public void Fillbustapcardinfo(Integer serviceid, Integer stopid, String Cardnumber) {
		$(SearchForm.ADMIN_BUSCHECKIN_TAB).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSCHECKIN).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSTAPCARD_SERVICEID).clear();
		$(SearchForm.ADMIN_BUSTAPCARD_SERVICEID).type(String.valueOf(serviceid));
		$(SearchForm.ADMIN_BUSTAPCARD_STOPID).clear();
		$(SearchForm.ADMIN_BUSTAPCARD_STOPID).type(String.valueOf(stopid));
		$(SearchForm.ADMIN_BUSTAPCARD_CARDNUM).clear();
		$(SearchForm.ADMIN_BUSTAPCARD_CARDNUM).type(Cardnumber);
		

	}
	@Step("User tap in")
	public void UserTapin() {
		$(SearchForm.ADMIN_BUSCHECKIN_ADD).click();
		onthegohomepage.waitForAngularRequestsToFinish();
	}
	@Step("User tap out")
	public void UserTapout() {
		$(SearchForm.ADMIN_BUSTAPCARD_TAPIN).click();
		onthegohomepage.waitForAngularRequestsToFinish();
		$(SearchForm.ADMIN_BUSCHECKIN_ADD).click();
		onthegohomepage.waitForAngularRequestsToFinish();
	}
	@Step("Verify bus service response")
	public void Verifybustapresponse(String message) {
		onthegohomepage.waitForAngularRequestsToFinish();
		assertThat($(SearchForm.ADMIN_BUSTAPCARD_ERROR).getText(),equalTo(message));
	}
	
}
