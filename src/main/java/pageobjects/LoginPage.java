package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
	//xpath of email
	@FindBy(xpath="//input[@name='username']")
	WebElement emailAddressTextField;

	//xpath of password
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;

	//xpath of login button
	@FindBy(xpath="//button[@class='login-btn false']")
	WebElement loginButton;
	
	//Methos for email fields
	public WebElement emailAddressTextField() {
		
		return emailAddressTextField;
		
	}
	
	//Method for password field
	public WebElement passwordField() {
		
		return passwordField;
		
	}
	
	//Method for login button
	public WebElement loginButton() {
		
		return loginButton;
	}
}
