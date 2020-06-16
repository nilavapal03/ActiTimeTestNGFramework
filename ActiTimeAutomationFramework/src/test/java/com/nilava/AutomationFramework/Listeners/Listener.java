package com.nilava.AutomationFramework.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution is On Test Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution is on Test Sucess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution is on Test Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution is on Test Skipp");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Execution is on Test Success Percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Execution is on Test on Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("happy Ending");
		
	}

}
