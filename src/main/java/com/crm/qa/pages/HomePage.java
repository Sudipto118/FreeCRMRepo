package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),' group automation ')]")
	WebElement user;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyUser() {
	
		return user.isDisplayed();
		
	}
	public void clickOnNewContact() {
		Actions action=new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContact.click();
		
		
		
	}
}
