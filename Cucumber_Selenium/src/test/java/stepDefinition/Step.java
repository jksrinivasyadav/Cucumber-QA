package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class Step {
	WebDriver driver;
	LoginPage login;
	
	@Given("^I am accessing my webpage$")
	public void i_am_accessing_my_webpage() throws Throwable {
		 login = new LoginPage(driver);
		 login.navigateTo();
		 
	}

	@When("^I user my user and password$")
	public void i_user_my_user_and_password() throws Throwable {
	   login.clickSign();
	   login.EnterUsernameAndPassword("selenium", "Sele1986");	
	}

	@And("^I should see error$")
	public void i_should_access_page() {
	  
	}
	@After
	public void tearDown() {
		driver.quit();		
	}
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jksri\\OneDrive\\Desktop\\Geckodriver.exe\\geckodriver.exe");
		 DesiredCapabilities cap = DesiredCapabilities.firefox();
		 cap.setCapability("marionette", true);
		 driver = new FirefoxDriver();
		
	}

}
