package com.phptravels.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravels.pages.HomePage;
import com.phptravels.pages.LoginPage;
import com.phptravels.utils.Browsers;


public class VerifyDownloadInvoioce {

	WebDriver driver;
	//This will launch browser and site
	
	@BeforeClass
	public void start() {
		Browsers browser = new Browsers();
	 driver=browser.startBrowser("chrome","http://www.phptravels.net/admin");
	}

	@Test
	public void downloadInvoice() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.typeUserName("admin@phptravels.com");
		login.typePassword("demoadmin");
		login.clickLoginButton();
		Thread.sleep(1000);
		HomePage home=new HomePage(driver);
		System.out.println("Test executing");
		home.clickOnBookings();
		home.clickInvoice();
		home.clickDownloadInvoice();
	}
		
	@AfterClass
	public void close_brower() {
		driver.quit();
	}
			
			
	
}
