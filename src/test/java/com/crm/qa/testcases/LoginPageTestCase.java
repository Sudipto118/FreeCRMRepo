
package com.crm.qa.testcases;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.qa.customListeners.CustomListener;
@Listeners(CustomListener.class)
public class LoginPageTestCase extends TestBase {
	Logger log=Logger.getLogger(LoginPageTestCase.class);
	static LoginPage login;
	HomePage home;
	public LoginPageTestCase() throws IOException {
		super();
		
	}
@BeforeMethod
public void setup() throws IOException {
	initialization();
	login=new LoginPage();
}

@Test(priority = 1)
public void validatePageTitle() throws IOException {
	
	String title=login.getPageTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
}
@Test(priority=2)
public void LoginTest() throws IOException {
	home=login.login(prop.getProperty("username"),prop.getProperty("password"));
	log.info("Logged in as :"+prop.getProperty("username"));
}
@AfterMethod
public void TearDown() {
	driver.quit();
}
}