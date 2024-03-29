package com.integra.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.integra.base.TestBase;
import com.integra.pages.Login_Page;
import com.integra.pages.ProgramAndRole;

public class Program_Role_testscript extends TestBase
{
Login_Page loginpage;
ProgramAndRole program_role;



	public Program_Role_testscript()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage = new Login_Page();
		program_role = loginpage.Login_to_Portal(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void validateProgram_RoleTitle() 
	{
		String title = program_role.validateProgram_And_Role_title();
		Assert.assertEquals(title, "Integra Choice & Control");
	}
	
	@Test(priority=2)
	public void Program_RoleTest() throws InterruptedException
	{
		program_role.Program_And_Role(prop.getProperty("program"), prop.getProperty("role"));
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
