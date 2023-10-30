package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.Profile;
import resources.Base;

public class StudentLoginTest extends Base{
    WebDriver driver;

	 @BeforeMethod
	public void openApplication() throws IOException {
		
		//Initialize the driver
		driver = initializeDriver();
		driver.get(prop.getProperty("studenturl"));
		
	}

	@Test(dataProvider="getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException, InterruptedException {
	
		//Perform login functionality
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();
		
		//Create object for profile page and check the login is successful or not
		Profile profilePage = new Profile(driver);
		
		String actualResult = null;
		
		try {
			
			if(profilePage.profileName().isDisplayed()) {
			   actualResult = "Success";
			}
			
		} catch(Exception e) {
			
			actualResult = "Failure";
			
		}
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
    //closing the browser
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}
	
	//Dummy data to using test login
	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data = {{"ama12gaya@gmail.com", "Amali1998##", "Success"}, {"dummy@test.com", "1234", "Failure"}};
		
		return data;
		
	}
}
