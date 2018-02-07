package com.phptravels.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToCmsModule{
  WebDriver driver ;
  
	By Username = By.name("email");
	By Password = By.name("password");
	By SignIn = By.xpath("html/body/div[1]/form[1]/button");
	By CMS = By.xpath("//a[contains(.,'CMS')]");
	By Pages = By.xpath("//a[contains(.,'Pages')]");
	By EditButton = By.xpath("//table[@class='xcrud-list table table-striped table-hover']/tbody/tr[1]/td[7]/span/a[@title='Edit']");
	By NewValue = By.name("pagetitle");
	By button = By.className("btn btn-primary");
	By LogOut = By.xpath("//a[contains(.,'Log Out')]");
	
	 
	public  GoToCmsModule(WebDriver driver) {
		 this.driver = driver;
	 
	}
	
	public void LoginDetails() {
		
		driver.findElement(Username).sendKeys("admin@phptravels.com");
		driver.findElement(Password).sendKeys("demoadmin");
		driver.findElement(SignIn).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void CMSPage() {
		driver.findElement(CMS).click();
	  	driver.findElement(Pages).click();	
	  	driver.findElement(EditButton).click();
		driver.findElement(NewValue).sendKeys("Swathi");
		driver.findElement(button).click();
		driver.findElement(LogOut).click();
		
	}
	
}
	