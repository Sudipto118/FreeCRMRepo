package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;

public TestBase() throws IOException {
	prop=new Properties();
FileInputStream ip=new FileInputStream("C:\\Users\\Sudipto\\eclipse-workspace\\FreeCRMTestAuomation\\src\\main\\java\\com\\crm\\qa\\config\\Config.properties");
prop.load(ip);;
}
public void initialization() {
	if (prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudipto\\OneDrive\\Study\\Chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
}
}
