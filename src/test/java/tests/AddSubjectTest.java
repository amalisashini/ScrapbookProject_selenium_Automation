package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AddSubjectPage;
import pageobjects.LoginPage;
import resources.Base;


public class AddSubjectTest extends Base{
  
   WebDriver driver;    

    //  @BeforeMethod
	// public void openApplication() throws IOException {
		
	// 	driver = initializeDriver();
	// 	driver.get(prop.getProperty("consumerurl"));
		
	// }

    @Test(dataProvider="giveLoginData")
	public void login(String email, String password) throws IOException, InterruptedException {

        driver = initializeDriver();
		driver.get(prop.getProperty("adminurl"));
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();

         AddSubjectPage subject = new AddSubjectPage(driver);
		 subject.addSubjectBtn().click();

	}

    @DataProvider
	public Object[][] giveLoginData() {
		
		Object[][] data = {{"adminemailtest@vintomaper.com", "Modinu.ogujuh@mentonit.net5"}};
		
		return data;
		
	}
    
}
