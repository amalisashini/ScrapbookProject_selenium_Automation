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
	
	//xpath for add subject button
	@FindBy(xpath="//button[@class='add-subject-btn  undefined']")
	WebElement addSubjectBtn;

	//xpath for subject name
	@FindBy(xpath="//input[@name='subjectName']")
	WebElement subjectName;

	//xpath for upload image
	// @FindBy(xpath="//input[@class='position-absolute']")
	// WebElement uploadImage;
	
	//Methos for add subject button
	public WebElement addSubjectBtn() {
		
		return addSubjectBtn;
		
	}

	//Methos for subject name
	public WebElement subjectName() {
		
		return subjectName;
		
	}

	//Methos for upload image
	// public WebElement uploadImage() {
		
	// 	return uploadImage;
		
	// }

		
}
