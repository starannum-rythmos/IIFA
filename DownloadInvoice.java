import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DownloadInvoice {

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
    public void login() throws InterruptedException
	{
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[contains(@href,'/admin/bookings/')])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@title='View Invoice'])[1]")).click();
	    ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(a.get(1));
	    System.out.println(a.get(1)+ " "+a.get(0));
	    //WebElement e=driver.findElement(By.linkText("Download PDF"));
	    WebElement e=driver.findElement(By.xpath("//*[@class='text-center']//child::button"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",e);
	    Thread.sleep(2000);
	}
	    
	 @AfterTest
	 public void close() { 	
        driver.close();
	    }
	
	}

