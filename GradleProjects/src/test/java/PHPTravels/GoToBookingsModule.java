package PHPTravels;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoToBookingsModule {
	
	String baseurl = "http://www.phptravels.net/admin";
	WebDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver. findElement(By.xpath("html/body/div[1]/form[1]/button")).click();
		
	}
	
	@Test
	public void bookings() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(.,'Bookings')]")).click();
		
	}
	
    @AfterMethod
    public void logout() {
    			
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		driver.quit();
	}

}
