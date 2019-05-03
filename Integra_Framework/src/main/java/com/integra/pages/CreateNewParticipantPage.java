package com.integra.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.integra.base.TestBase;

public class CreateNewParticipantPage extends TestBase {
	
	@FindBy(xpath="//a[contains(@title,'Add New')]")
	WebElement ClickOn_AddParticipant;
	
	// Participant Personal Details elements
	
	@FindBy(xpath="//input[contains(@navname,'ExternalReferenceID')]")
	WebElement txt_NDIA_Number;
	
	@FindBy(xpath="//select[contains(@navname,'EnrollmentStatus')]")
	WebElement Drop_Select_Status;
	
	@FindBy(xpath="//select[contains(@navname,'DistrictNo')]")
	WebElement Drop_Select_Service_Catalogue;
	
	@FindBy(xpath="//select[contains(@navname,'IntegraService')]")
	WebElement Drop_Select_Integra_Service;
	
	@FindBy(xpath="//input[@value=\"1\"]")
	WebElement redio_Salutation;
	
	@FindBy(xpath="//input[contains(@navname,'FirstName')]")
	WebElement txt_First_Name;
	
	@FindBy(xpath="//input[contains(@navname,'MiddleName')]")
	WebElement txt_Middle_Name;
	
	@FindBy(xpath="//input[contains(@navname,'LastName')]")
	WebElement txt_Last_Name;
	
	@FindBy(xpath="//select[contains(@navname,'DisabilityType')]")
	WebElement Drop_Select_Disability_Type;
	
	@FindBy(xpath="//input[contains(@navname,'OtherDisabilityType')]")
	WebElement txt_OtherDisabilityType;
	
	@FindBy(xpath="//input[contains(@navname,'PreferredName')]")
	WebElement txt_Preferred_Name;
	
	@FindBy(xpath="//select[contains(@navname,'IndigenousStatus')]")
	WebElement Drop_Select_Indigenous_Status;
	
	@FindBy(xpath="//textarea[@id=\"20153\" and @navname=\"Notes\"]")
	WebElement txt_Comments;
	
	// Participant contact elements
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressAddress')]")
	WebElement txt_Unit_Street_Number_Street_Name ;
	
	@FindBy(xpath="//select[contains(@navname,'State')]")
	WebElement Drop_Select_State;
	
	@FindBy(xpath="//select[contains(@navname,'PreferredContactName')]")
	WebElement Drop_Select_Region;
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressCity')]")
	WebElement txt_Suburb_Town_City;
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressZipCode')]")
	WebElement txt_PostCode;
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressPhone')]")
	WebElement txt_HomePhone;
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressMobile')]")
	WebElement txt_MobilePhone;
	
	@FindBy(xpath="//input[contains(@navname,'PhysicalContactAddressEmail')]")
	WebElement txt_Email;
	
	@FindBy(xpath="//select[contains(@navname,'PreferredContact')]")
	WebElement Drop_Select_Preferred_Communication;
	
	@FindBy(xpath="//select[contains(@navname,'IsSMSEnabled')]")
	WebElement Drop_Select_Speaks_English;
	
	@FindBy(xpath="//select[contains(@navname,'PrimaryLanguage')]")
	WebElement Drop_Select_Preferred_Language;
	
	@FindBy(xpath="//select[contains(@navname,'IsInterpreterRequired')]")
	WebElement Drop_Select_IsInterpreterRequired;
	
	@FindBy(xpath="//select[contains(@navname,'RelationshiptoParticipant')]")
	WebElement Drop_Select_Relationship_to_Participant;
	
	@FindBy(xpath="//input[contains(@navname,'InterpreterName')]")
	WebElement txt_Interpreter_Name;
	
	@FindBy(xpath="//input[contains(@navname,'InterpreterPhone')]")
	WebElement txt_Interpreter_Phone;
	
	@FindBy(xpath="//input[contains(@navname,'InterpreterEmail')]")
	WebElement txt_Interpreter_Email;
	
	@FindBy(xpath="//select[contains(@navname,'GenericValue')]")
	WebElement Drop_Select_Automatic_EmailOptIn;
	
	//Participant Plan Elements
	
	@FindBy(xpath="//select[contains(@navname,'ReferralSource')]")
	WebElement Drop_Select_ReferralSource;
	
	@FindBy(xpath="//input[contains(@navname,'OtherReferralSource')]")
	WebElement txt_OtherReferralSource;
	
	@FindBy(xpath="//select[contains(@navname,'CaseManagerAgencyNo')]")
	WebElement Drop_Select_SCAgency;
	
	@FindBy(xpath="//select[contains(@navname,'CaseManagerNo')]")
	WebElement Drop_Select_Support_Coordinator;
	
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
	
	public String validate_ParticipantPage_title()
	{
		ClickOn_AddParticipant.click();
		return driver.getTitle();
	}
	
	public boolean Validate_Participant_pageBody()
	{
		return Participant_Body_Title.isDisplayed();
	}
	
}

