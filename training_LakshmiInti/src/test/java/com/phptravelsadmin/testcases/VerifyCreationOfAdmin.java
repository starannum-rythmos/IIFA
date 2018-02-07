package com.phptravelsadmin.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.phptravelsadmin.pages.AdminPage;
import com.phptravelsadmin.pages.LoginPage;
import com.phptravelsadmin.utils.BrowserFactory;

public class VerifyCreationOfAdmin {
	WebDriver driver;
	AdminPage adminPage;
	LoginPage login;
	@BeforeClass
	public void start(){
		driver=BrowserFactory.startBrowser("firefox", "https://www.phptravels.net/admin");
			
	}
	
	@BeforeTest
	public void beforetest(){
		login=new LoginPage(driver);
		login.Logindetails();
	}
	@Test
	public void verifyCreation(){
		adminPage= new AdminPage(driver);
		adminPage.addAdminDetails();
		}
	@AfterClass
	public void shutdown()
	{
		driver.quit();
	}

}
