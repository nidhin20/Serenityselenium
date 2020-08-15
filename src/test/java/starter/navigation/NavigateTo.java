package starter.navigation;

import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
public class NavigateTo {

//    DuckDuckGoHomePage duckDuckGoHomePage;
	@Shared
    OnthegoHomepage onthegohomepage;
//    @Step("Open the DuckDuckGo home page")
//    public void theDuckDuckGoHomePage() {
//        duckDuckGoHomePage.open();
//    }
    @Step("Open theonthego home page")
    public void ToLoginpage() {
    	onthegohomepage.open();
    }
    
    @Step("User landed to dashboard")
    public void Checkredirection(String expectedurl) {
    	onthegohomepage.waitForAngularRequestsToFinish();
    	assertThat(onthegohomepage.getDriver().getCurrentUrl(),equalTo(expectedurl));
    }
   
	
}
