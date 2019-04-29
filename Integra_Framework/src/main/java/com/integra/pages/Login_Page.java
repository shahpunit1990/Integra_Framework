package com.integra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.integra.base.TestBase;

public class Login_Page extends TestBase 
{

	//page factory---OR

	@FindBy(id="ctl00_MainBody_txtUserName1")
	WebElement username;
	
	@FindBy(id="ctl00_MainBody_txtPassword1")
	WebElement password;
	
	@FindBy(name="ctl00$MainBody$btnLogin1")
	WebElement login_button;
	
	// creating Login_page constructor to initilize the PageFactory
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions(Methods)
	public String verify_loginpage_title()
	{
		return driver.getTitle();
	}
	
	public ProgramAndRole Login_to_Portal(String un, String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		login_button.click();
		
		return new ProgramAndRole();
		
	}
	 
	
	
	
	
	
	
}
