package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;

public class LoginSteps {
	WebDriver driver;
	LoginPages loginpage;
	
	@Given("^Open application$")
	public void open_Application_And_Enter_Url() {

		loginpage = new LoginPages(driver);
		loginpage.navigateTo();
	}
	@When("^I click on login button$")
	public void clickonLoginbttn() {
		loginpage.clickLoginBttn();
	}
	@Then("^I enter (.*) and (.*)$")
	public void enterUserNameAndPassword(String user, String pass) {
		loginpage.enterUsernameAndPassword(user, pass);
		
	}
	@And("^I should see following message$")
	public void message() {
		loginpage.getErrorMessage();
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jksri\\OneDrive\\Desktop\\Geckodriver.exe\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}
			
}
