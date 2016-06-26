package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import pages.ContactUs;
import pages.JobSearchPage;
import pages.MenuBar;
import pages.RegistrationPage;
import pages.SignInPage;

@Listeners(listener.TestListener.class)
public class TestBase extends Driver {

	String browserType = getBrowserType();
	String appUrl = getEnvProperty("appUrl");
	
	
	
	protected static JobSearchPage jobSearchPage;
	protected static SignInPage signInPage;
	protected static RegistrationPage registrationPage;
	protected static MenuBar menuBar;
	protected static ContactUs contactUs;

	@BeforeTest
	public void setUp() {
		try {
			setDriver(browserType, appUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		jobSearchPage = PageFactory.initElements(driver, JobSearchPage.class);
		signInPage = PageFactory.initElements(driver, SignInPage.class);
		registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		contactUs = PageFactory.initElements(driver, ContactUs.class);
		//jobSearchPage = new JobSearchPage();
	}
	@AfterTest
	public void tearDown(){
		getDriver().quit();
	}

}
