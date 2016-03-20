package com.sree.maps.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginSecondaryPasswordPage {
	
	private WebDriver driver;
	

	@FindBy(how=How.NAME,using="password2")
	private WebElement password2;
	
	@FindBy(how=How.NAME,using="Submit2")
	private WebElement submit;
	
	public LoginSecondaryPasswordPage(WebDriver driver){
		this.driver = driver;
	}
	

	public void setPassword(String input){
		password2.sendKeys(input);
	}
	
	public void clickLogin(){
		submit.click();
	}
	
	public void loginWithSecondaryPassword(String password){
		setPassword(password);
		clickLogin();
	}
}
