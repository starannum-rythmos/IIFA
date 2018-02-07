package PHPTravels;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoToAccountsTab {
	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
	
	@BeforeTest
	public void browserLaunch()
	{
	
	WebDriver driver =new FirefoxDriver();
	driver.get(baseurl);
    driver.manage().window().maximize();
    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
    driver.findElement(By.name("password")).sendKeys("demoadmin");
    driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	}
	
	@BeforeMethod
	public void accountsTab() throws InterruptedException {
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(.,'Accounts')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(.,'Admins')]")).click();
	}
		
	@Test
	public void addAccounts() throws InterruptedException {
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath(".//*[@id='content']/div/form/button")).click();
	    driver.findElement(By.name("fname")).sendKeys("Rythmos");
	    driver.findElement(By.name("lname")).sendKeys("admin");
	    driver.findElement(By.name("email")).sendKeys("ssaripalli@rythmos.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.name("mobile")).sendKeys("8674245691");
	    driver.findElement(By.xpath("//b[contains (.,select2-arrow)]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='select2-search']")).sendKeys("India");
	    driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/div/span[text()='India']")).click();
	      
	    driver.findElement(By.name("address1")).sendKeys("Financial Dt");
	    driver.findElement(By.name("address2")).sendKeys("Kapil Towers");
	}
		
	@AfterMethod
	public void submitAccount() throws InterruptedException {
	    driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
	    Thread.sleep(4000);
	    
	}
			
	@AfterTest
	
	public void logOut() {
		driver.findElement(By.xpath("(//a[contains(.,'Log Out')]")).click();
	    driver.quit();
 
	}
	
	
	

}
