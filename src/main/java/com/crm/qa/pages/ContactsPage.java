package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage  extends TestBase {

	public ContactsPage() throws IOException {
	PageFactory.initElements(driver, this);
		
	}

}
