package com.InentBanking99project.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.InentBanking99project.pageObjects.Loginpage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException
	{
		driver.get(BaseUrl);
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		logger.info("user name is entered");
		lp.setpassword(password);
		logger.info("password is entered");
		lp.clicklogin();
		logger.info("clicked on login");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			logger.info("login test passed");
			Assert.assertTrue(true);
		}
		else
		{   captureScreen(driver,"loginTest");
			logger.info("login test failed");
			Assert.assertTrue(false);
			
		}
	}
	
	







}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

