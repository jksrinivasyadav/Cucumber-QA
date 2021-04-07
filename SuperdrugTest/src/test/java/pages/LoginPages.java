package pages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPages {
	WebDriver driver;
	
	public LoginPages(WebDriver driver) {
		this.driver = driver;

	}
	
	By login = By.cssSelector("body > div.page > header > div > nav > div.rd-navbar-inner > div > a");
	By user = By.cssSelector("#ui > div > div > form > div > div:nth-child(1) > div > input[type=text]");
	By pass = By.cssSelector("#ui > div > div > form > div > div:nth-child(2) > div > input[type=password]");
	By submit = By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button");
	By error = By.cssSelector("#ui > div > div > form > div > div.ui.negative.message > div");
	
	public void clickLoginBttn() {
		driver.findElement(login).click();
		
	}
	public void navigateTo() {
		driver.get("https://freecrm.com/");
	}
	public void enterUsernameAndPassword(String users, String passwd) {
		driver.findElement(user).sendKeys(users);
		driver.findElement(pass).sendKeys(passwd);
		driver.findElement(submit).click();
			
	}
	public void getErrorMessage() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String message = driver.findElement(error).getText();
		System.out.println(message +" "+ "srini");
		assertEquals(message, "Something went wrong...");
	}
	 
}
