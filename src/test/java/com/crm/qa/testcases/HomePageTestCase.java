package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;


public class HomePageTestCase extends TestBase{
	LoginPage login;
	HomePage home;
	TestUtil test;
	public HomePageTestCase() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		login=new LoginPage();
		home=new HomePage();
		test=new TestUtil();
		login.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test(priority=1)
	public void verifyUserTest() throws IOException {
		
		test.switchToFrame("mainpanel");
		Assert.assertTrue(home.verifyUser(),"User is not verified");
	}
	
	@Test(priority=2)
	public void clickonNewContactsTest() {
		test.switchToFrame("mainpanel");
		home.clickOnNewContact();
	}


}
