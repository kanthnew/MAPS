package com.sree.maps.MAPS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import com.sree.maps.pom.AdsTrafficPage;
import com.sree.maps.pom.EntryPage;
import com.sree.maps.pom.HomePage;
import com.sree.maps.pom.LoginPage;
import com.sree.maps.pom.LoginSecondaryPasswordPage;
import com.sree.maps.utils.Utilities;

public class ViewAdsTest {

	@Test
	public void main(){
	//public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SREEKANTH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		FirefoxProfile pf = new FirefoxProfile();
		//WebDriver driver = new FirefoxDriver(pf);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myadvertisingpays.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		EntryPage entryPage = PageFactory.initElements(driver, EntryPage.class);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginSecondaryPasswordPage loginSecondaryPasswordPage = PageFactory.initElements(driver, LoginSecondaryPasswordPage.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		//AdsTrafficPage adsPage = PageFactory.initElements(driver, AdsTrafficPage.class);
		
		entryPage.clickSignIn();
		loginPage.login("kanthads", "shreee12");
		loginSecondaryPasswordPage.loginWithSecondaryPassword("12shreee");
		
		String currentUrl = driver.getCurrentUrl();
		homePage.openLinkinNewTabsMultipleTimes(1);
		
		String currentWinHandle = driver.getWindowHandle();
		Set<String> winhandles = driver.getWindowHandles();
		
		for(String handle : winhandles){
			driver.switchTo().window(handle);
			
			currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("viewAds.asp")){
				AdsTrafficPage adsPage = PageFactory.initElements(driver, AdsTrafficPage.class);
				
				for(int i = 0;i < 10;i++){
					adsPage.clickRandomAd();
				
					adsPage.viewAd();
				
					adsPage.viewNextAdsPage();
					
					if(Utilities.isAlertDialogPresent(driver)){
						driver.switchTo().alert().accept();
					}
				}
				
				
			}
			
		}
		
		
		
		
		
	}
	
	
}