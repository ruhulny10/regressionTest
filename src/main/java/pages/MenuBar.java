package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MenuBar extends PageBase{
	
	@FindBy( linkText = "Register")
	public WebElement registerLink;
	
	@FindBy( linkText = "Job Search")
	public WebElement jobsearch;
	
	@FindBy( css = "a[href ='contactus.php']")
	public WebElement contactUs;
	
	@FindBy( linkText = "Signin")
	public WebElement signinLink;

}
