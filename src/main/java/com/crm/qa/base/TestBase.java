 package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
Logger log=Logger.getLogger(TestBase.class);
public TestBase() throws IOException {
	prop=new Properties();
FileInputStream ip=new FileInputStream("C:\\Users\\Sudipto\\eclipse-workspace\\FreeCRMTestAuomation\\src\\main\\java\\com\\crm\\qa\\config\\Config.properties");
prop.load(ip);
}
public void initialization() {
	if (prop.getProperty("browser").equals("chrome")) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
//		 ChromeOptions options=new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
//		 driver=new ChromeDriver(options);
//		
		driver =new ChromeDriver();
	}
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	//driver.get(prop.getProperty("url"));
	driver.get("https://classic.crmpro.com");
log.info("Launched Url Successfully");
}
}
