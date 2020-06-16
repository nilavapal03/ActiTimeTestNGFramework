package com.nilava.AutomationFramework;

import com.nilava.AutomationFramework.GenericUtils.Driver;

public class Testing {

	public static void main(String[] args) {
	Driver.launchBrowser("Chrome");
	Driver.driver.get("http://localhost/login.do");

	}

}
