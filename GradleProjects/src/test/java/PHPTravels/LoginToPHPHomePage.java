package PHPTravels;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToPHPHomePage {

	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
	   
	@BeforeMethod
	public void browserLaunch()
	{
	WebDriver driver =new FirefoxDriver();
	driver.get(baseurl);
	}
	    @Test
	    public void verifyHomePage()
	{
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}
	    @AfterMethod
	    public void logOut()
	    {
	    driver.findElement(By.xpath("(//*[contains(@class,'nav navbar-right')]//child::a)[2]")).click();
	    driver.close();
	    }

}
