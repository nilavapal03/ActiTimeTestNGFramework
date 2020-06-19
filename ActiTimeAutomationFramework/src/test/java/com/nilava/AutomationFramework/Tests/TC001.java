package com.nilava.AutomationFramework.Tests;

/**
 * * @author nilava
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.nilava.AutomationFramework.GenericUtils.Driver;
import com.nilava.AutomationFramework.GenericUtils.ReusableMethods;
import com.nilava.AutomationFramework.POM.LoginPage;

public class TC001 {

	// ================= Object creation starts=================//

	

	Properties prop = new Properties();
	LoginPage loginpage;
	ReusableMethods reuse= new ReusableMethods();
	// ================= Object creation Ends=================//

	
	

	{
		try {
			prop.load(new FileInputStream("./resourceLib/ConfigFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Parameters({ "Browser" })
	@BeforeTest
	public void launchBrowser(String browserName) {
		Driver.launchBrowser(browserName);

	}


	@Parameters({ "URL" })
	@BeforeClass
	public void setUp(String url) {
		Driver.driver.get(url);
	}



	@AfterTest
	public void tearDown() {
		Driver.driver.quit();
	}

	

	@AfterClass
	public void close() {
		System.out.println("Close the execution");
	}

	@Test
	public void loginActiTime() {
		loginpage = new LoginPage();
		loginpage.loginActiTime(prop.getProperty("userName"), prop.getProperty("PassWord"));
		
	}

}
