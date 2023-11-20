package com.discover.loginTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.discover.loginPages.LoginPage;
import com.discoverBase.BaseTest;
import com.discoverUtilities.PropertiesReader;

public class LoginTest extends BaseTest{
	LoginPage lp;
	PropertiesReader pr;
	
	@BeforeMethod
	public void opendiscoverApp() {
		openApp();
	}
	@Test
		public void LoginTest() {
		pr=new PropertiesReader();
		lp=new LoginPage(driver);
		lp.userNameMethod(pr.UserName());
		lp.passwordMethod(pr.Password());
		lp.dropDown();
		lp.Login();
	
	}
		//@AfterMethod
		public void closediscoverApp() {
			closeApp();
}
}
