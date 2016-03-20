package com.sree.maps.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdsTrafficPage {
	
	
	
	private WebDriver driver;
	
	
	//@FindBy(how=How.CSS,using="#traffic > input[type='Submit'] ")
	//private List<WebElement> adLink;
	
	public AdsTrafficPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void clickRandomAd(){
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		System.out.println("Win handles:"+driver.getWindowHandles().size());
		//driver.findElement(By.linkText("Log Out")).click();
		driver.findElement(By.name("strSearch")).sendKeys("search text");
		
		List<WebElement> adLink = driver.findElements(By.cssSelector("#traffic>input[type='submit']"));
		
		System.out.println("Links : "+adLink.size());
		
		adLink.get(1).click();
	}
	
	public void viewAd(){
		String captchatext = driver.findElement(By.id("blur")).getText();
		
		driver.findElement(By.name("codesend")).sendKeys(captchatext);
		driver.findElement(By.name("Submit")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#log>a")));
		
		
	}
	
	public void viewNextAdsPage(){
		
		driver.findElement(By.cssSelector("#log>a")).click();
		
	}

}
