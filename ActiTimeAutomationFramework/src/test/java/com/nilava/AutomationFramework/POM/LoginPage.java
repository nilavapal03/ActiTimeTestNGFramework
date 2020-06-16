package com.nilava.AutomationFramework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nilava.AutomationFramework.GenericUtils.Driver;



public class LoginPage {

	@FindBy(how=How.ID, using="username")
	private WebElement userName;
	
	
	@FindBy(how=How.NAME, using="pwd")
	private WebElement passWord;
	
	
	@FindBy(how=How.XPATH, using="//a[@id='loginButton']")
	private WebElement clickOnLoginButton;
	
	
	public LoginPage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	
	public void loginActiTime(String username, String password) {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		clickOnLoginButton.click();
		
	}
}
