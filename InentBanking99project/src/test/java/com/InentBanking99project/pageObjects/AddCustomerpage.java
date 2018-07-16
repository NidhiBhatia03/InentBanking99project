package com.InentBanking99project.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {
	
	WebDriver ldriver;

	public AddCustomerpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement btnnewcustomer;


	@FindBy(name="name")
	@CacheLookup
	WebElement CustomerName;

	@FindBy(name="rad1")
	@CacheLookup
	WebElement RadioGender;

	@FindBy(name="dob")
	@CacheLookup
	WebElement DateofBirth;

	@FindBy(name="addr")
	@CacheLookup
	WebElement Address;

	@FindBy(name="city")
	@CacheLookup
	WebElement City;

	@FindBy(name="state")
	@CacheLookup
	WebElement State;

	@FindBy(name="pinno")
	@CacheLookup
	WebElement PinNumber;

	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement TelePhone;

	@FindBy(name="emailid")
	@CacheLookup
	WebElement Email;


	@FindBy(name="password")
	@CacheLookup
	WebElement password;

	@FindBy(name="sub")
	@CacheLookup
	WebElement Submit;
	
	
	public void clickAddCustomer()
	{
		btnnewcustomer.click();}
	
	public void custname(String cname)
	{
		CustomerName.sendKeys(cname);}
	
	public void gender(String cgander)
	{
		RadioGender.click();}
	
	public void custdateobirth(String mm,String dd,String yy)
	{DateofBirth.sendKeys(mm);
	DateofBirth.sendKeys(dd);
	DateofBirth.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{Address.sendKeys(caddress);}
	
	public void custcity(String ccity) {
		City.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		State.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		PinNumber.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		TelePhone.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		Email.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		password.sendKeys(cpassword);
	}

	public void custsubmit() {
		Submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
