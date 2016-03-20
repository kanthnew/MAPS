package com.sree.maps.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EntryPage {
	
	private WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="Here")
	private WebElement signinlink;
	
	public EntryPage(WebDriver driver){
		this.driver = driver;
	}
	
	public  void clickSignIn(){
		signinlink.click();
	}
	

}
