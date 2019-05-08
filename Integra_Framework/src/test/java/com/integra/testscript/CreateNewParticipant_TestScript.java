package com.integra.testscript;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.CreateNewParticipantPage;
import com.integra.pages.HomePage;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;
import com.integra.util.TestUtill;

public class CreateNewParticipant_TestScript extends TestBase {
	Login_Page loginpage;
	ProgramAndRole program_role;
	HomePage homepage;
	CreateNewParticipantPage participantpage;
	String sheetName = "Add_Participant";

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
		participantpage = homepage.Create_new_participant();

	}



	@Test(priority=1)
	public void validate_ParticipantPage_Title()
	{
		String title = participantpage.validate_ParticipantPage_title();
		Assert.assertEquals(title,"New Participant");		

	}
	@Test(priority=2)
	public void verify_Participant_pageBody() 
	{
		boolean title = participantpage.Validate_Participant_pageBody();
		assertTrue(title);

	}
	@Test(priority=3)
	public void Participant_ErrorMessage() throws InterruptedException	
	{
		participantpage.Participant_ErrorMessage();
	}

		
		@DataProvider
		public Object[][] getIntegraTestData() 
		{
			Object data[][] = TestUtill.getTestData(sheetName);
			return data;
		}
		

		
		
		@Test(priority=4, dataProvider="getIntegraTestData")
		public void Create_Participant_Profile(String NDIA_Number)
		{
			participantpage.Create_participant(NDIA_Number);
		}
		
//		public void Create_Participant_Profile(String NDIA_Number,String Status,String Service_Catalogue,String Integra_Service,String Salutation,String First_Name,String Middle_Name,String Last_Name,String Disability_Type, String Other_Disability_Type,String Preferred_Name,String Indigenous_Status,String Comments,String Unit_Street_Name,String State_Territory,String Region,String Suburb_City,String Postcode,String Home_Phone,String Mobile_Phone,String Email)
//		{
//			participantpage.Create_participant(NDIA_Number, Status, Service_Catalogue, Integra_Service, Salutation, First_Name, Middle_Name, Last_Name, Disability_Type, Other_Disability_Type, Preferred_Name, Indigenous_Status, Comments, Unit_Street_Name, State_Territory, Region, Suburb_City, Postcode, Home_Phone, Mobile_Phone, Email);
//		}
		
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}





}
