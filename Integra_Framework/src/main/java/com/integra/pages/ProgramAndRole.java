package com.integra.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.integra.base.TestBase;

public class ProgramAndRole extends TestBase
{

	//page factory---OR
	@FindBy(name="ctl00$MainBody$ddUserPrograms")
	WebElement select_program;
	
	@FindBy(id="ctl00_MainBody_ddUserProgramRoles")
	WebElement select_role;
	
	@FindBy(id="ctl00_MainBody_Button1")
	WebElement go_btn;
	
	
	public ProgramAndRole()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateProgram_And_Role_title()
	{
		return driver.getTitle();
	}
	
	public HomePage Program_And_Role(String PR, String RE) throws InterruptedException 
	{
		select_program.sendKeys(PR);
		select_role.sendKeys(RE);
  
    
     go_btn.click();
	 return new HomePage();
		
	}
	
}
