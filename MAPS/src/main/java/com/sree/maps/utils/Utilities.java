package com.sree.maps.utils;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	public static boolean isAlertDialogPresent(WebDriver driver){
		
		    boolean foundAlert = false;
		    WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
		    try {
		        wait.until(ExpectedConditions.alertIsPresent());
		        foundAlert = true;
		    } catch (TimeoutException eTO) {
		        foundAlert = false;
		    }
		    return foundAlert;
		}
	
	

}
