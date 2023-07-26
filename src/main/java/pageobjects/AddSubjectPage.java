package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSubjectPage {
     WebDriver driver;
	
	public AddSubjectPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(xpath="//button[@class='add-subject-btn  undefined']")
	WebElement addSubjectBtn;
	
	public WebElement addSubjectBtn() {
		
		return addSubjectBtn;
		
	}

		
}
