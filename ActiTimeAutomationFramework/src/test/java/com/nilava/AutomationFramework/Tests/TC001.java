package com.nilava.AutomationFramework.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nilava.AutomationFramework.GenericUtils.Driver;
import com.nilava.AutomationFramework.POM.LoginPage;

public class TC001 {
	// =================================Object creation starts Here=================================
	Properties prop = new Properties();
	LoginPage loginpage;
	// =================================Object creation Ends=================================
	{
		try {
			prop.load(new FileInputStream("./resourceLib/ConfigFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void launchURL() {
		Driver.launchBrowser(prop.getProperty("Browser"));
		Driver.driver.get(prop.getProperty("URL"));

	}
	
	@AfterTest
	public void tearDown() {
		Driver.driver.quit();
	}

	@Test
	public void loginActiTime() {
		loginpage = new LoginPage();
		loginpage.loginActiTime(prop.getProperty("userName"), prop.getProperty("PassWord"));
	}

}
