package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory object repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBTN;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBTN;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement imageLogo;
}
