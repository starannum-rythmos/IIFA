package com.phptravels.testcase;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.phptravels.pages.GoToCmsModule;
import com.phptravels.utils.BrowserFactory;

public class VerifyLoginToHomePage {
	
	    WebDriver driver;
		
				
		@BeforeTest
		public void start(){
			BrowserFactory browser = new BrowserFactory();
			driver= browser.startBrowser("firefox", "https://www.phptravels.net/admin");
			System.out.println("browser launched");
				
		}
		
		@Test
		public void beforetest() throws InterruptedException{
			Thread.sleep(4000);
			System.out.println("before login");
			GoToCmsModule login = new GoToCmsModule(driver);
			login.LoginDetails();
			System.out.println("logged in");
			login.CMSPage();
			System.out.println("cms");
			}
		
		@AfterTest
		public void shutdown()
		{
			driver.quit();
		}

	}


