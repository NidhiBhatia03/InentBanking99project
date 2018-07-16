package com.InentBanking99project.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InentBanking99project.pageObjects.AddCustomerpage;
import com.InentBanking99project.pageObjects.Loginpage;

public class TC_AddCustomer_003 extends BaseClass {
	
	
@Test
public void addNewcustomer() throws InterruptedException, IOException
{
Loginpage lp=new Loginpage(driver);
lp.setusername(username);
lp.setpassword(password);
lp.clicklogin();
Thread.sleep(3000);

AddCustomerpage addcust=new AddCustomerpage(driver);
addcust.clickAddCustomer();
logger.info("providing customer details....");
addcust.custname("nidhi");
addcust.gender("female");
addcust.custdateobirth("10", "10", "1983");
Thread.sleep(3000);
addcust.custaddress("Canada");
addcust.custcity("Mississauga");
addcust.custstate("Ontario");
addcust.custpinno("123456");
addcust.custtelephoneno("34256789");

String email= randomestring()+"@gmail.com";
addcust.custemailid(email);
addcust.custpassword("123456");
addcust.custsubmit();
Thread.sleep(3000);
logger.info("validation started....");

boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

if(res==true)
{
	Assert.assertTrue(true);
	logger.info("test case passed....");
}
else
{
	captureScreen(driver,"addNewcustomer");
	Assert.assertTrue(false);
}
	

}




}
