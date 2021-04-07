package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By regEmail = By.cssSelector("#email");
	By regPhone = By.cssSelector("#phone_number");
	By agreeCheck = By.cssSelector("#terms");
	By captcha = By.xpath("//*[text()='not a robot']");
	
	public void goToHomePage() {
		driver.get("https://register.freecrm.com/register/");
	}
	public void enterEmailAndPhoneNumber(String email,String phone) {
		driver.findElement(regEmail).sendKeys(email);
		driver.findElement(regPhone).sendKeys(phone);
		driver.findElement(agreeCheck).click();
//		try {
//			Thread.sleep(8000);
//		} catch (InterruptedException e) {
//			 TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(captcha).click();
		
	}
	


}
