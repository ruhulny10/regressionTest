package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import base.PageBase;

public class SignInPage extends PageBase {

	/*
	 * WebElement:
	 */
	@FindBy(name = "Email")
	private WebElement emailField;

	@FindBy(name = "Password")
	private WebElement passwordlField;

	@FindBy(name = "submit")
	private WebElement signInButton;
	@FindBy(id = "error")
	public List<WebElement> errorMessage;

	/*
	 * By Type Locator:
	 * 
	 */
	By emailFieldLocator = By.name("Email");

	/*
	 * Supporting method;
	 */
	public void signin(String email, String password) {
		emailField.clear();
		emailField.sendKeys(email);

		passwordlField.clear();
		passwordlField.sendKeys(password);

		signInButton.click();
	}

}
