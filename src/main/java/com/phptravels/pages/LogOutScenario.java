package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutScenario {
	
		public WebDriver driver;

		By username=By.name("email");
		By password=By.name("password");
		By loginButton=By.xpath("//*[@type='submit']");
		By logout=By.linkText("Log Out");
		 
		public LogOutScenario(WebDriver driver) {
		 
		this.driver=driver;
		 
		}
		 
		public void typeUserName(String uid) {
		 
		driver.findElement(username).sendKeys(uid);
		}
		 
		public void typePassword(String pass) {
		 
		driver.findElement(password).sendKeys(pass);
		}
		 
		public void clickLoginButton() {
		 
		driver.findElement(loginButton).click();
		}
		public void clickLogoutButton() {
		driver.findElement(logout).click();
			}
		
}