package com.sree.maps.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(how=How.NAME,using="username")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	
	@FindBy(how=How.NAME,using="Submit")
	private WebElement submit;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void setUsername(String input){
		username.sendKeys(input);
	}
	
	public void setPassword(String input){
		password.sendKeys(input);
	}
	
	public void clickLogin(){
		submit.click();
	}
	
	public void login(String username, String password){
		setUsername(username);
		setPassword(password);
		clickLogin();
		
	}
	
}
