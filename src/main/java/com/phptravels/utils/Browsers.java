package com.phptravels.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

WebDriver driver;
	
	public WebDriver startBrowser(String browsername,String url) {
		
		if(browsername.equalsIgnoreCase("Firefox")){
			
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\selenium practise\\chromedriver.exe");
		 driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("IE")) {
			
			driver=new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	
}
