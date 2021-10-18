package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

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
		password.sendKeys(pwd);
		submit.click();
		return new HomePage();
	}
}
