package com.crm.qa.util;

import java.io.IOException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void switchToFrame(String name) {
		driver.switchTo().frame(name);
	}
}
