package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AddSubjectPage;
import pageobjects.LoginPage;
import resources.Base;


public class AddSubjectTest extends Base{
  
   WebDriver driver;    

    @Test(dataProvider="giveLoginData")
	public void login(String email, String password) throws IOException, InterruptedException {

		//initialize the web URL
        driver = initializeDriver();
		driver.get(prop.getProperty("adminurl"));
	
		//Perform the login functionality
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();

		//Click on the 'Add subject' button
		AddSubjectPage subject = new AddSubjectPage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", subject.addSubjectBtn());

		subject.subjectName().sendKeys("History");
		

	}

	//Dummy data to be passed to the driver when the login
    @DataProvider
	public Object[][] giveLoginData() {
		
		Object[][] data = {{"adminemailtest@vintomaper.com", "Modinu.ogujuh@mentonit.net5"}};
		
		return data;
		
	}
    
}
