package com.integra.testscript;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.CreateNewParticipantPage;
import com.integra.pages.HomePage;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;

public class CreateNewParticipant_TestScript extends TestBase {
	Login_Page loginpage;
	ProgramAndRole program_role;
	HomePage homepage;
	CreateNewParticipantPage participantpage;

	public CreateNewParticipant_TestScript()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		loginpage = new Login_Page();
		program_role = loginpage.Login_to_Portal(prop.getProperty("username"), prop.getProperty("password"));
		homepage = program_role.Program_And_Role(prop.getProperty("program"), prop.getProperty("role"));
		
	}
	
	@Test
	public void validate_ParticipantPage_Title()
	{
		String title = participantpage.validate_ParticipantPage_title();
		Assert.assertEquals(title,"New Participant");		
		
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
	
	
}
