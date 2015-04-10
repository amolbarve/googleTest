package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.GmailCreateAccount;
import pageObjects.GoogleLogin;
import pageObjects.GoogleUKHome;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class MandatoryFieldValidationSteps {
	
	WebDriver driver;
	
	@Before
	public void beforescenario(){
		System.out.println("before scenario");
		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^User is on google UK home page as \"(.*?)\"$")
	public void user_is_on_google_UK_home_page_as(String URL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(URL);
	}

	@When("^User navigates to gmail link$")
	public void user_navigates_to_gmail_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    GoogleUKHome homepage = new GoogleUKHome(driver);
	    homepage.gotogmail();
	}

	@When("^User enters <\"(.*?)\"> <\"(.*?)\"> <\"(.*?)\"> <\"(.*?)\"> <\"(.*?)\"> <\"(.*?)\"> <\"(.*?)\">$")
	public void user_enters(String firstName,String password, String birthday, String birthyear, String recoveryPhoneNumber, String skipcaptcha, String TermsofService) throws Throwable {
		GoogleLogin loginpage = new GoogleLogin(driver);
		loginpage.click_signup();
		
	    GmailCreateAccount accountcreation = new GmailCreateAccount(driver);
	    accountcreation.enterFirstName(firstName);
	    
	}

	@When("^user clicks on create account button$")
	public void user_clicks_on_create_account_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Username Mandatory Message shoudl be displayed to the user\\.$")
	public void username_Mandatory_Message_shoudl_be_displayed_to_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After
	public void afterscenario(){
		System.out.println("before scenario");
		driver.close();
		driver.quit();
	}
	
}
