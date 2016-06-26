package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestContactUsPage extends TestBase {
	
	@BeforeClass
	public void ClassSetUp(){
		menuBar.contactUs.click();
	}
	
	@Test
	public void testContactUsPage(){
		
		Assert.assertEquals(contactUs.getTitle(), "Contact Us | EliteCareer");
	}

}
