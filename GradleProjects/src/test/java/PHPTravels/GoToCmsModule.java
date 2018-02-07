package PHPTravels;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoToCmsModule {
	
	String baseurl = "http://www.phptravels.net/admin";
	WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/admin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver. findElement(By.xpath("html/body/div[1]/form[1]/button")).click();
	}
	@Test
	public void cmsTest() throws InterruptedException {
		Thread.sleep(3000);
	  	driver.findElement(By.xpath("//a[contains(.,'CMS')]")).click();
	  	driver.findElement(By.xpath("//a[contains(.,'Pages')]")).click();	
	  	driver.findElement(By.xpath("//table[@class='xcrud-list table table-striped table-hover']/tbody/tr[1]/td[7]/span/a[@title='Edit']")).click();
		driver.findElement(By.name("pagetitle")).sendKeys("Swathi");
		driver.findElement(By.className("btn btn-primary")).click();
	}
		
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("(//a[contains(.,'Log Out')]")).click();
	    driver.quit();
		
	}
		
		
	}


