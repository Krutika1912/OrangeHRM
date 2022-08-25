package com.Automation.Test;

import org.testng.annotations.Test;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest{

@Test
	
	public void VerifysuccessfulLogin()
	{
			DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
			LoginPage lp=new LoginPage();
			//lp.enterUsername("admin");
			lp.enterUsername(PropertyReader.getProperty("username"));
			//lp.enterPassword("Admin123");
			lp.enterPassword(PropertyReader.getProperty("password"));
			lp.clickbtnLogin();
			
			
	}
}
