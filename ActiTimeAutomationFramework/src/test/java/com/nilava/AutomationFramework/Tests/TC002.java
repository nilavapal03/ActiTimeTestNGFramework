package com.nilava.AutomationFramework.Tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC002 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	
	public void afterclass() {
		System.out.println("After class");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("before test");
	}
	
	@Test
	public void m1() {
		System.out.println("test execution");
	}
	
	
	
	
}
