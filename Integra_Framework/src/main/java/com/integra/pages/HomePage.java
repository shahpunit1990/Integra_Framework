package com.integra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.integra.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@title=\"Support Coordinator Search\"]")
	WebElement SC_Search;
	
	@FindBy(xpath="//a[contains(@title,'Add New')]")
	WebElement ClickOn_AddParticipant;
	
	
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public String validate_Home_Page_title()
	{
		return driver.getTitle();
	}
	
	public SupportCoordinatorSearchPage SC_search_tab()
	{
		SC_Search.click();
		return new SupportCoordinatorSearchPage();
		
	}
	public CreateNewParticipantPage Create_new_participant() 
	{
		ClickOn_AddParticipant.click();
		return new CreateNewParticipantPage();
	}
}
