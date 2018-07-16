package com.InentBanking99project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{ ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="uid")
    @CacheLookup
    WebElement txtusername;
	
	@FindBy(name="password")
    @CacheLookup
    WebElement txtpassword;
	
	
	@FindBy(name="btnLogin")
    @CacheLookup
    WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
    @CacheLookup
    WebElement btnLogout;
	
	

	public void setusername(String uname)
	{txtusername.sendKeys(uname);}
	
	public void setpassword(String pwd)
	{txtpassword.sendKeys(pwd);}
	
	public void clicklogin()
	{btnLogin.click();}
	
	
	public void clicklogout()
	{btnLogout.click();}
	
	
}
