package com.phptravelsadmin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username=By.xpath("//input[@name='email']");
	By passwrd=By.xpath("//input[@name='password']");
	By sign_in=By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']");
	public LoginPage(WebDriver driver){
		this.driver = driver;	
      }
	public void Logindetails(){
	driver.findElement(username).sendKeys("admin@phptravels.com");
	driver.findElement(passwrd).sendKeys("demoadmin");
	driver.findElement(sign_in).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
    
	
}