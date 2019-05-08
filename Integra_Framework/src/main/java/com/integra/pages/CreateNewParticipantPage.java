package com.integra.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.integra.base.TestBase;

public class CreateNewParticipantPage extends TestBase {


	// Participant Personal Details elements

	@FindBy(xpath="//input[contains(@navname,'ExternalReferenceID')]")
	WebElement txt_NDIA_Number;

//	@FindBy(xpath="//select[contains(@navname,'EnrollmentStatus')]")
//	WebElement Drop_Select_Status;
//
//	@FindBy(xpath="//select[contains(@navname,'DistrictNo')]")
//	WebElement Drop_Select_Service_Catalogue;
//
//	@FindBy(xpath="//select[contains(@navname,'IntegraService')]")
//	WebElement Drop_Select_Integra_Service;
//
//	@FindBy(xpath="//input[@value=\"1\"]")
//	WebElement redio_Salutation;
//
//	@FindBy(xpath="//input[contains(@navname,'FirstName')]")
//	WebElement txt_First_Name;
//
//	@FindBy(xpath="//input[contains(@navname,'MiddleName')]")
//	WebElement txt_Middle_Name;
//
//	@FindBy(xpath="//input[contains(@navname,'LastName')]")
//	WebElement txt_Last_Name;
//
//	@FindBy(xpath="//select[contains(@navname,'DisabilityType')]")
//	WebElement Drop_Select_Disability_Type;
//
//	@FindBy(xpath="//input[contains(@navname,'OtherDisabilityType')]")
//	WebElement txt_OtherDisabilityType;
//
//	@FindBy(xpath="//input[contains(@navname,'PreferredName')]")
//	WebElement txt_Preferred_Name;
//
//	@FindBy(xpath="//select[contains(@navname,'IndigenousStatus')]")
//	WebElement Drop_Select_Indigenous_Status;
//
//	@FindBy(xpath="//textarea[@id=\"20153\" and @navname=\"Notes\"]")
//	WebElement txt_Comments;
//
//	// Participant contact elements
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressAddress')]")
//	WebElement txt_Unit_Street_Number_Street_Name ;
//
//	@FindBy(xpath="//select[contains(@navname,'State')]")
//	WebElement Drop_Select_State;
//
//	@FindBy(xpath="//select[contains(@navname,'PreferredContactName')]")
//	WebElement Drop_Select_Region;
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressCity')]")
//	WebElement txt_Suburb_Town_City;
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressZipCode')]")
//	WebElement txt_PostCode;
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressPhone')]")
//	WebElement txt_HomePhone;
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressMobile')]")
//	WebElement txt_MobilePhone;
//
//	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressEmail')]")
//	WebElement txt_Email;
//
//	@FindBy(xpath="//select[contains(@navname,'PreferredContact')]")
//	WebElement Drop_Select_Preferred_Communication;
//
//	@FindBy(xpath="//select[contains(@navname,'IsSMSEnabled')]")
//	WebElement Drop_Select_Speaks_English;
//
//	@FindBy(xpath="//select[contains(@navname,'PrimaryLanguage')]")
//	WebElement Drop_Select_Preferred_Language;
//
//	@FindBy(xpath="//select[contains(@navname,'IsInterpreterRequired')]")
//	WebElement Drop_Select_IsInterpreterRequired;
//
//	@FindBy(xpath="//select[contains(@navname,'RelationshiptoParticipant')]")
//	WebElement Drop_Select_Relationship_to_Participant;
//
//	@FindBy(xpath="//input[contains(@navname,'InterpreterName')]")
//	WebElement txt_Interpreter_Name;
//
//	@FindBy(xpath="//input[contains(@navname,'InterpreterPhone')]")
//	WebElement txt_Interpreter_Phone;
//
//	@FindBy(xpath="//input[contains(@navname,'InterpreterEmail')]")
//	WebElement txt_Interpreter_Email;
//
//	@FindBy(xpath="//select[contains(@navname,'GenericValue')]")
//	WebElement Drop_Select_Automatic_EmailOptIn;
//
//	//Participant Plan Elements
//
//	@FindBy(xpath="//select[contains(@navname,'ReferralSource')]")
//	WebElement Drop_Select_ReferralSource;
//
//	@FindBy(xpath="//input[contains(@navname,'OtherReferralSource')]")
//	WebElement txt_OtherReferralSource;
//
//	@FindBy(xpath="//select[contains(@navname,'CaseManagerAgencyNo')]")
//	WebElement Drop_Select_SCAgency;
//
//	@FindBy(xpath="//select[contains(@navname,'CaseManagerNo')]")
//	WebElement Drop_Select_Support_Coordinator;

	@FindBy(xpath="//div[@id=\"SaveProfileFailMSG\"]")
	WebElement Participant_Error_Message;


	//Third Party Representative

	//Local Area Coordinator

	@FindBy(css="h2[class=\"card--title\"]")
	WebElement Participant_Body_Title;

	@FindBy(xpath="//button[@id=\"SaveconProfilebtn\" and @value=\"Save\"]")
	WebElement Save_Participant_btn;

	public CreateNewParticipantPage()
	{

		PageFactory.initElements(driver, this);
	}

	//Methods 

	// to verify participant title
	public String validate_ParticipantPage_title()
	{

		return driver.getTitle();
	}

	//to verify  participant body title
	public boolean Validate_Participant_pageBody()
	{
		return Participant_Body_Title.isDisplayed();
	}

	// to verify participant page mandatory fields
	public void Participant_ErrorMessage() throws InterruptedException
	{
		Save_Participant_btn.click();
		Thread.sleep(1500);
		String ErrorMessage= Participant_Error_Message.getText();
		System.out.println(ErrorMessage);
	}


		
		public void Create_participant(String NDIA_No)
		{
			
//			public void Create_participant(String NDIA_No, String status, String ServiceCatalogue, String IntegraService, String salutation, String Fname, String Mname, String Lname, String DisabilityType, String OtherDisabilityType, String PreferredName, String IndigenousStatus, String Comments,
//					   String UnitStreetName, String StateTerritory, String region, String City, String PostCode, String HPhone, String MPhone, String Email)

			
			
			txt_NDIA_Number.sendKeys(NDIA_No);
			int length= NDIA_No.length();
			if(length<9)
			{
				System.out.println("Length is less than 9");

			}
			else
			{
				System.out.println("Greater than 9");
			}

			
//			Select dropdown_status = new Select(Drop_Select_Status);
//			dropdown_status.selectByValue(status);
//			
//			Select dropdown_ServiceCatalogue = new Select(Drop_Select_Service_Catalogue);
//			dropdown_ServiceCatalogue.selectByValue(ServiceCatalogue);
//			
//			Select dropdown_IntegraService = new Select(Drop_Select_Integra_Service);
//			dropdown_IntegraService.selectByValue(IntegraService);
//			
//			redio_Salutation.sendKeys(salutation);
//			txt_First_Name.sendKeys(Fname);
//			txt_Middle_Name.sendKeys(Mname);
//			txt_Last_Name.sendKeys(Lname);
//			
//			Select dropdown_Disability_Type_ = new Select(Drop_Select_Disability_Type);
//			dropdown_Disability_Type_.selectByValue(DisabilityType);
//			
//			txt_OtherDisabilityType.sendKeys(OtherDisabilityType);
//			txt_Preferred_Name.sendKeys(PreferredName);
//			
//			Select dropdown_Select_Indigenous_Status = new Select(Drop_Select_Indigenous_Status);
//			dropdown_Select_Indigenous_Status.selectByValue(IndigenousStatus);
//			
//			txt_Comments.sendKeys(Comments);
//			txt_Unit_Street_Number_Street_Name.sendKeys(UnitStreetName);
//			
//			Select dropdown_Select_State = new Select(Drop_Select_State);
//			dropdown_IntegraService.selectByValue(StateTerritory);
//			
//			Select dropdown_Select_Region = new Select(Drop_Select_Region);
//			dropdown_Select_Region.selectByValue(region);
//			
//			txt_Suburb_Town_City.sendKeys(City);
//			txt_PostCode.sendKeys(PostCode);
//			txt_HomePhone.sendKeys(HPhone);
//			txt_MobilePhone.sendKeys(MPhone);
//			txt_Email.sendKeys(Email);
			
			
			
		}

}

