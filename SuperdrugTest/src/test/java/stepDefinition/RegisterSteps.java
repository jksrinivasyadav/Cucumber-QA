package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class RegisterSteps {
	WebDriver driver;
	RegisterPage regpage;
	//https://ui.cogmento.com/
	
	@Given("^I m app homepage and click on login bttn$")
	public void goToPage() {
		regpage = new RegisterPage(driver);
		regpage.goToHomePage();	
	}
	@When("^I type valid user (.*) and (.*)$")
	public void enterEmailAndPhone(String email,String phone) {
		regpage.enterEmailAndPhoneNumber("selenium1986@gmail.com", "07484877850");
		
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
