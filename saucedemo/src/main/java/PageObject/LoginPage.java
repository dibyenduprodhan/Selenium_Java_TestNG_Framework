package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BasePage;

public class LoginPage extends BasePage{
	//just passing the driver to the basepage class
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	private By uname=By.id("user-name");
	private By pass=By.id("password");
	private By login=By.id("login-button");
	
	//actions
	public void enterUsername(String username) {
		driver.findElement(uname).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickLogin(){
		driver.findElement(login).click();
	}
	
	
	
	
}
