import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomePage {
	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
   
	@BeforeTest
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium practise\\chromedriver.exe");
		driver=new ChromeDriver();
	}
    @Test
    public void verifyHomePage()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}
    @AfterTest
    public void logOut()
   	{
    	driver.findElement(By.xpath("(//*[contains(@class,'nav navbar-right')]//child::a)[2]")).click();
    	driver.close();
   	}
   
}