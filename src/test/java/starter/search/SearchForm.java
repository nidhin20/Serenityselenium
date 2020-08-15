package starter.search;

import org.openqa.selenium.By;
import com.paulhammant.ngwebdriver.ByAngular;
public class SearchForm {
    static By SEARCH_FIELD = By.name("q");
    static By SEARCH_BUTTON = By.cssSelector(".search__button");
    static By SEARCH_FIELD_ON_RESULT_PAGE = By.cssSelector("#search_form_input");
    static By SEARCH_BUTTON_ON_RESULT_PAGE = By.cssSelector("#search_button");
    static By LOGIN_LOGIN_BUTTON= By.id("btnlogin");
    static By LOGIN_SIGNUP_BUTTON = By.id("btnsignup");
    static By LOGIN_EMAIL = By.id("txtemail");
    static By LOGIN_PASSWORD = By.id("txtpassword");
    public static By LOGIN_ERROR_MSG=By.id("mat-error-1");
    static By HOME_LINKCARD_MORE=By.id("btnlinkmorecard");
    static By HOME_LINKCARD=By.id("txtlinkcard");
    static By HOME_LINKCARD_BUTTON=By.id("btnlinkcard");
    static By HOME_LINKCARD_ERROR=By.id("txterrormessage");
    static By HOME_CARD_RESULT=By.className("card-title");
    static By HOME_SIGNUP_BUTTON= By.id("btnsignup");
    static By REGISTER_USERNAME= By.id("txtsignupname");
    static By REGISTER_EMAIL= By.id("txtsignupemail");
    static By REGISTER_PHONENO= By.id("txtphoneno");
    static By REGISTER_DOB= By.id("txtdob");
    static By REGISTER_PASSWORD= By.id("txtsignuppassword");
    static By REGISTER_BUTTON= By.id("btnregister");
    static By ADMIN_SUBCRIBTION_TAB= By.id("btnsubscibtiontab"); 
    static By ADMIN_SUBCRIBTION= By.id("btnsubscribtion"); 
    static By ADMIN_BUSCHECKIN_TAB= By.id("btnbuscheckintab"); 
    static By ADMIN_BUSCHECKIN= By.id("btnBuscheckin"); 
    static By ADMIN_BUSCHECKIN_ADD= By.id("btncheckinout"); 
    static By ADMIN_BUSSERVICE_TAB= By.id("btnbusservicetab"); 
    static By ADMIN_BUSSERVICE_ADD= By.id("btnAddnewbusservice"); 
    static By ADMIN_BUSSERVICE= By.id("btnbusservice"); 
    static By ADMIN_SUBCRIBTION_ADD= By.id("btnAddnewsubscribtion");
    static By ADMIN_BUSTYPE= By.id("btnbustype");
    static By ADMIN_BUSTYPE_ADD= By.id("btnAddnewbustype");
    
    // Add subscribtion
    static By ADMIN_SUBSCRIBTION_PLAN= By.id("txtsubplanid");
    static By ADMIN_SUBSCRIBTION_PLANNAME= By.id("txtsubplanname");
    static By ADMIN_SUBSCRIBTION_CARDCAT= By.id("txtsubplancardcat");
    static By ADMIN_SUBSCRIBTION_DEFAULTPLAN= By.id("txtsubplandefaultplan");
    static By ADMIN_SUBSCRIBTION_PERIOD= By.id("txtsubplansubprd");
    static By ADMIN_SUBSCRIBTION_RATE= By.id("txtsubplandefaultrate");
    static By ADMIN_SUBSCRIBTION_ERROR= By.id("txtsubscribtionErrormessage");
    
    //Add Bus type
    static By ADMIN_BUSTYPE_NAME= By.id("txtbustypename");
    static By ADMIN_BUSTYPE_SEAT= By.id("txtseat");
    static By ADMIN_BUSTYPE_STAND= By.id("txtstand");
    static By ADMIN_BUSTYPE_ERROR= By.id("txtbustypeErrormessage");
    
  //Add Bus service name
    static By ADMIN_BUSSERVICE_NAME= By.id("txtservicename");
    static By ADMIN_BUSSERVICE_ERROR= By.id("txtbusserviceErrormessage");
    
    //Add bus tap card
    static By ADMIN_BUSTAPCARD_SERVICEID= By.id("txtbustapserviceid");
    static By ADMIN_BUSTAPCARD_STOPID= By.id("txtbustapstopid");
    static By ADMIN_BUSTAPCARD_CARDNUM= By.id("txtbustapcardnum");
    static By ADMIN_BUSTAPCARD_TAPIN= By.id("chktapin");
    static By ADMIN_BUSTAPCARD_ERROR= By.id("txtbustapErrormessage");
    
    //Add subscribtion to card
    static By ADMIN_CARDSUB_PLANID= By.id("txtsubplanid");
    static By ADMIN_CARDSUB_CARDNUM= By.id("txtcardnumber");
    static By ADMIN_CARDSUB_PAYREF= By.id("txtpaymentrefno");
    static By ADMIN_CARDSUB_SUBERROR= By.id("txtsubscribtionErrormessage");
    static By ADMIN_CARDSUB_ADD= By.id("btnsubscribtioncard");
    
    public static By REGISTER_ERRORMESSAGE=By.id("txterrormessage");
}
