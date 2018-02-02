import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LogOut {

	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
   
	@BeforeTest
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium practise\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
    @Test
    public void verifyLogout() throws InterruptedException
	{
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Log Out")).click();
	    
	}

    @AfterTest
    public void logOut()
   	{
		driver.close();
   	}
}