package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class RegistrationPage extends PageBase {
	
	
	
	@FindBy( name = "FirstName")
	public WebElement firstNameField;
	
	
	@FindBy( name = "LastName")
	public WebElement lastNameField;
	
	
	@FindBy( name = "Gender")
	public WebElement genderDropDownList;
	
	
	@FindBy( name = "DateOfBirth")
	public WebElement dateOfBirth;
	
	
	@FindBy( name = "PhoneNo")
	public WebElement phoneNumberField;
	
	
	@FindBy( name = "UserType")
	public WebElement userTypeDropeDownList;
	
	
	@FindBy( name = "Email")
	public WebElement emailField;
	
	@FindBy( name = "Password")
	public WebElement passwordField;
	
	@FindBy( name = "ConfirmPassword")
	public WebElement confirmPasswordField;
	
	@FindBy( name = "Captcha")
	public WebElement captchaField;
	
	@FindBy( name = "Privacy")
	public WebElement privacyCheckBox;
	
	@FindBy( name = "Subscribe")
	public WebElement subscribefield;
	
	@FindBy( name = "submit")
	public WebElement submitButton;
	
	@FindBy(id = "error")
	public List<WebElement> errorWebElementList;
	

}
