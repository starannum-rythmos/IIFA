package com.phptravels.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravels.pages.LogOutScenario;
import com.phptravels.pages.LoginPage;

import com.utility.BrowserFactory;

public class TestScenario {

		WebDriver driver;
//This will launch browser and site
		@BeforeTest
		public void start() {
			BrowserFactory browser= new BrowserFactory();
		driver=browser.startBrowser("firefox","http://www.phptravels.net/admin");
		}
		@Test
		public void test() throws InterruptedException {
			
			
			LoginPage login=new LoginPage(driver);
			login.typeUserName("admin@phptravels.com");
			login.typePassword("demoadmin");
			login.clickLoginButton();
			Thread.sleep(3000);
			LogOutScenario logout=new LogOutScenario(driver);
			logout.clickLogoutButton();
			Thread.sleep(3000);
		}
		@AfterTest
		public void close_browser() {
			driver.quit();
		}



}
