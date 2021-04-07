package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By signIn = By.linkText("Sign in");
	By username = By.cssSelector("#email");
	By password = By.cssSelector("#passwd");
	By submit = By.cssSelector("#SubmitLogin");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateTo() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	public void clickSign() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(signIn).click();
		//return new LoginPage(driver);
	}
	public void EnterUsernameAndPassword(String user,String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();
		//return new LoginPage(driver);
		
	}

}
