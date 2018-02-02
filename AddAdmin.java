import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AddAdmin {

	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
	@BeforeTest
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium practise\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/admin");
		driver.manage().window().maximize();
	}
	@Test
	public void downloadInvoice() throws InterruptedException {
		
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
	    driver.findElement(By.linkText("Admins")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	    driver.findElement(By.name("fname")).sendKeys("Divya");
	    driver.findElement(By.name("lname")).sendKeys("Chokkanna");
	    driver.findElement(By.xpath("//*[@type='email']")).sendKeys("divyaammu459@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("11234");
	    driver.findElement(By.name("mobile")).sendKeys("23456");
	    driver.findElement(By.xpath("//b[contains (.,select2-arrow)]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("India");  
	    driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/div/span[text()='India']")).click();
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("ameerpet");
	    driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("hyd");
	    driver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/div/div[13]/div/div/label/div/ins")).click();
	    driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
	}
	@AfterTest
    public void logOut()
   	{
		driver.close();
   	}
}