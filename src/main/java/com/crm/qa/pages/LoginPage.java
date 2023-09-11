package com.crm.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	Logger log=Logger.getLogger(LoginPage.class);
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@value='Login']")
	WebElement submit;


	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);	
	}
	public String getPageTitle() {
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	public HomePage login(String un,String pwd ) throws IOException {
		username.sendKeys(un);
		log.info("Usename enterd:"+un);
		password.sendKeys(pwd);
		log.info("Password enterd correctly");
		submit.click();
		log.info("Looged into Homepage");
		return new HomePage();
	}
}
