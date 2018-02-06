package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	WebDriver driver;
	public  WebDriver startBrowser(String browsername,String url){
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette","D://karthik//geckodriver.exe");
		driver = new FirefoxDriver();
		 
		}else if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.marionette", "D://karthik//chromedriver.exe");
		driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.chrome.driver", "D://karthik//IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		 
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		}

}
