package com.nilava.AutomationFramework.GenericUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {
	
	// implicit wait
	// thread sleep
	// windows handel
	//frame handel
	//alert
	//action class
	//explicit wait
	
	public void implicitwait(int i) {
		Driver.driver.manage().timeouts().implicitlyWait(i*10, TimeUnit.SECONDS);
	}
	
	public void sleepTime(int i) throws InterruptedException {
		Thread.sleep(i*1000);
	}
	
	public String moveChildwindow() {
		Set set=Driver.driver.getWindowHandles();
		Iterator<String> it= set.iterator();
		String childWindow= it.next();
		Driver.driver.switchTo().window(childWindow);
		return childWindow;
		}
	public String moveParentWindow() {
		Set set=Driver.driver.getWindowHandles();
		Iterator<String> it= set.iterator();
		String Parentwindow= it.next();
		Driver.driver.switchTo().window(Parentwindow);
		return Parentwindow;
	}
	
	//This is overloading concept
	
	public void frame(int frameIndex) {
		Driver.driver.switchTo().frame(frameIndex);
	}
	
	public void frame(String nameOrID) {
		Driver.driver.switchTo().frame(nameOrID);
		}
	
	public void frame(WebElement frameElement) {
		Driver.driver.switchTo().frame(frameElement);
	}

	
	public void alert(String action) {
		Alert alt= Driver.driver.switchTo().alert();
		if(action.trim().equalsIgnoreCase("ACCEPT")) {
			alt.accept();
		}else {
			alt.dismiss();
			}
		}
	
	public String getTextFromAlert() {
		Alert alt= Driver.driver.switchTo().alert();
		return alt.getText();
		}
	

	// assignmnets all action class method need to implemmets here except double click
	//rightclick
	//drag and drop
	//clickAndhold
	//moveto element
	
	public void performAction(String action, String xpathExpression) {
		Actions act= new Actions(Driver.driver);
		if(action.trim().equalsIgnoreCase("DoubleClick")) {
			WebElement wb= Driver.driver.findElement(By.xpath(xpathExpression));
			act.doubleClick();
		}else if(action.trim().equalsIgnoreCase("RightClick")) {
			
		}
		
	}
	
	// assignmnets all action class method need to implemmets here for keyboard operations
	
	//explicit wait
		
	
	

}
