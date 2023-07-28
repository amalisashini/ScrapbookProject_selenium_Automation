package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
    WebDriver driver;
	
    public Profile(WebDriver driver){
    	
    	this.driver = driver;
    	
    	PageFactory.initElements(driver,this);
    	    	
    }
    //xpath for 'my subject' text
    @FindBy(xpath="//span[contains(text(),'My Subjects')]")
    WebElement profileName;
    
    //Method for 'my subject' text
    public WebElement profileName() {
    	
    	return profileName;
    	
    }
}
