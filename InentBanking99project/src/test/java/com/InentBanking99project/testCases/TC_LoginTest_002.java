package com.InentBanking99project.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.InentBanking99project.pageObjects.Loginpage;
import com.InentBanking99project.utilities.XLUtils;

public class TC_LoginTest_002 extends BaseClass {
	
	
	@Test(dataProvider="LoginData")
	public void loginDDt(String user, String pwd) throws InterruptedException
	
	{
		Loginpage lp=new Loginpage(driver);
		lp.setusername(user);
		logger.info("user name provided");
		lp.setpassword(pwd);
		logger.info("password provided");
		lp.clicklogin();
		Thread.sleep(3000);
			
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Thread.sleep(3000);
			logger.info("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			lp.clicklogout();
			driver.switchTo().alert().accept(); 
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			logger.info("login passed");
		}
		
	 }
	
		public boolean isAlertPresent()
		{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
		
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException 
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/InentBanking99project/testData/data.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);

		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		
		return logindata;
		
	}
		

		
		
		
	}
	
	
	
	

