package com.phptravels.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By bookings=By.xpath("(//a[contains(@href,'/admin/bookings/')])[1]");
	By invoice=By.xpath("(//*[@title='View Invoice'])[1]");
	By downloadinvoice=By.xpath("//button[@id=\"downloadInvoice\"]");
	By logout=By.xpath("//a[contains(@href,'logout')]");

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void clickOnBookings() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(bookings).click();;
	}
	
	public void clickInvoice() throws InterruptedException {
		
		driver.findElement(invoice).click();
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(a.get(1));
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	}
	
	public void clickDownloadInvoice() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(driver.findElement(downloadinvoice).isDisplayed());
	    driver.findElement(downloadinvoice).click();
	    Thread.sleep(5000);
	}
	
	public void clickLogout() {
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(0));
		driver.findElement(logout).click();
		
	}
	
}

	

