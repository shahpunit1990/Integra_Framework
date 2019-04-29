package com.integra.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.HomePage;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;
import com.integra.pages.SupportCoordinatorSearchPage;
import com.integra.util.TestUtill;


public class Create_Support_Coordinator_TestScript extends TestBase {
	Login_Page loginpage;
	ProgramAndRole program_role;
	HomePage homepage;
	SupportCoordinatorSearchPage SC_Search_Page;
	
	String sheetName = "Add_SC";
	
	public Create_Support_Coordinator_TestScript()
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
		SC_Search_Page = homepage.SC_search_tab();
	}
	
	@Test(priority=1)
	public void validate_Support_Coordinator_title() 
	{
		String title = SC_Search_Page.verify_Support_CoordinatorTitle();
		Assert.assertEquals(title, "Support Coordinator Search");
	}
	
	@DataProvider
	public Object[][] getIntegraTestData() 
	{
		Object data[][] = TestUtill.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2, dataProvider="getIntegraTestData")
	public void Create_New_SC_Profile(String Email_ID, String First_Name, String Last_Name, String Street_Name,	String City_Name, String Post_Code, String Phone_No) 
	{
		SC_Search_Page.Create_New_Support_Coordinator(Email_ID, First_Name, Last_Name, Street_Name, City_Name, Post_Code, Phone_No);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	

}
