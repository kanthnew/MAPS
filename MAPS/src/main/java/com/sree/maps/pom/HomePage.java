package com.sree.maps.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.Keys;

public class HomePage {

	public WebDriver driver;
	
	
	@FindBy(how=How.LINK_TEXT,using="View Traffic Exchange Ads")
	private WebElement viewTrafficExchangeAdslink;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openLinkinNewTabsMultipleTimes(int count){
		for(int counter = 0; counter < count;counter++){
			//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
			//viewTrafficExchangeAdslink.sendKeys(selectLinkOpeninNewTab);
			viewTrafficExchangeAdslink.click();
		}
	}
	
	
	
}
