package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestRegistrationPage extends TestBase {

	@BeforeClass
	public void classSetUp() {
		menuBar.registerLink.click();
	}

	@Test
	public void testRegistrationWithValidData() {
		registrationPage.firstNameField.clear();
		registrationPage.firstNameField.sendKeys("Ruhul");

		registrationPage.lastNameField.clear();
		registrationPage.lastNameField.sendKeys("Amin");

		registrationPage.selectDropdownListElementByValue(registrationPage.genderDropDownList, "Female");

		registrationPage.dateOfBirth.clear();
		registrationPage.dateOfBirth.sendKeys("1980-05-10");

		registrationPage.phoneNumberField.clear();
		registrationPage.phoneNumberField.sendKeys("3472513210");

		registrationPage.selectDropdownListElementByValue(registrationPage.userTypeDropeDownList, "Jobseeker");

		registrationPage.emailField.clear();
		
		int rand = registrationPage.getRandomNumber(10000, 1000);
		String email = "ruhulny10"+rand+"@gmail.com";
		System.out.println(email);
		registrationPage.emailField.sendKeys("email");

		registrationPage.passwordField.clear();
		registrationPage.passwordField.sendKeys("as987123");

		registrationPage.confirmPasswordField.clear();
		registrationPage.confirmPasswordField.sendKeys("as987123");

		if (registrationPage.privacyCheckBox.isSelected()) {
			registrationPage.privacyCheckBox.click();

		}
		
		if (registrationPage.subscribefield.isSelected()) {
			registrationPage.subscribefield.click();

		}
		registrationPage.submitButton.click();
		boolean condition = registrationPage.getCurrentUrl().contains("//profile.php");
		Assert.assertTrue(condition);
		
		//TODO logout
		//TODO click regisration link to comeback registration page;
		
		
		
	}
	@Test
	public void  testRegistrationWithEmptyRequiredFields() {
		menuBar.registerLink.click();
		registrationPage.submitButton.click();
		
		
		List<WebElement> errorList = registrationPage.errorWebElementList;
		
		Assert.assertEquals(errorList.get(0).getText(), "* FirstName can not be empty.");
		Assert.assertEquals(errorList.get(1).getText(), "* LastName can not be empty.");
		Assert.assertEquals(errorList.get(2).getText(), "* Gender can not be empty.");
		
		Assert.assertEquals(errorList.get(3).getText(), "* DateOfBirth can not be empty.");
		Assert.assertEquals(errorList.get(4).getText(), "* PhoneNo can not be empty.");
		Assert.assertEquals(errorList.get(5).getText(), "* UserType can not be empty.");
		Assert.assertEquals(errorList.get(6).getText(), "* Email can not be empty.");
		Assert.assertEquals(errorList.get(7).getText(), "* Password can not be empty.");
		Assert.assertEquals(errorList.get(8).getText(), "* ConfirmPassword can not be empty.");
		Assert.assertEquals(errorList.get(9).getText(), "* Captcha can not be empty.");


		boolean condition = registrationPage.getCurrentUrl().contains("/register.php");
		Assert.assertTrue(condition);
		
		
			}

	@AfterTest
	public void classTearDown() {
		//menuBar.jobsearch.click();
	}

}
