package com.phptravelsadmin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	WebDriver driver;
	
	By accounts=By.xpath(".//*[@id='navbar']/ul[1]/li[2]/a");
	By Admin=By.linkText("Admins");
	By add=By.xpath("//button[@class='btn btn-success']");
	By fname=By.xpath("//input[@name='fname']");
	By lname=By.xpath("//input[@name='lname']");
	By email=By.xpath("//input[@name='email']");
	By Paswrd=By.xpath("//input[@name='password']");
	By mobileno=By.xpath("//input[@name='mobile']");
	By address1=By.xpath("//input[@name='address1']");
	By address2=By.xpath("//input[@name='address2']");
	By status=By.xpath("//*[@id='content']/form/div/div[2]/div/div[13]/div/div/label/div/ins");
	By select_cntry=By.linkText("Please Select");
	By edit_cntry=By.xpath("//div[@class='select2-search']");
	By select_inida=By.xpath("//*[@id='select2-drop']/ul/li[2]/div/span[text()='India']");
	By submit=By.xpath(".//*[@class='btn btn-primary']");
	
	public AdminPage(WebDriver driver){
		this.driver = driver;		
	}
	
	public void addAdminDetails(){
		
	    driver.findElement(accounts).click();
	    driver.findElement(Admin).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(add).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(fname).sendKeys("Lakshmi");
	    driver.findElement(lname).sendKeys("inti");
	    driver.findElement(email).sendKeys("chandra1208.inti@gmail.com");
	    driver.findElement(Paswrd).sendKeys("rest@1213");
	    driver.findElement(mobileno).sendKeys("6784567892");
	    driver.findElement(address1).sendKeys("ameerpet");
	    driver.findElement(address2).sendKeys("hyd");
	    driver.findElement(status).click();
	    driver.findElement(select_cntry).click();  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(edit_cntry).sendKeys("India");
	    driver.findElement(select_inida).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(submit).click();

	}

}
