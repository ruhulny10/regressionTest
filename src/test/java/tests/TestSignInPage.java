package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSignInPage extends TestBase {

	@BeforeClass
	public void classSetUp() {
		menuBar.signinLink.click();
	}

	@Test
	public void textSigninWithValidCredentials() {
		signInPage.signin("ruhulny10@gmail.com", "as987123");
		Assert.assertTrue(signInPage.getCurrentUrl().contains("profile.php"));
	}
	@Test
	public void textSigninWithInValidEmailAndValidPassword() {
		signInPage.signin("ruhulnyD10@gmail.com", "as9871235");
		Assert.assertEquals(signInPage.errorMessage.get(0).getText(), "* Email or Password is incorrect.");
	}

}
