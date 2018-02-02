

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CMS_Pages {
	
	String baseurl="http://www.phptravels.net/admin";
	WebDriver driver;
		
		@BeforeTest
		public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium practise\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		}
		
	    @Test
	    public void cmsPage() throws InterruptedException {
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.name("password")).sendKeys("demoadmin");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='row form-group']//descendant::button[3]")).click();
        driver.findElement(By.xpath("(//*[@class='fa fa-edit'])[1]")).click();
        driver.findElement(By.xpath("//*[@name='pagetitle']")).clear();
        driver.findElement(By.xpath("//*[@name='pagetitle']")).sendKeys("Discounts");
        driver.findElement(By.xpath("//*[text()='Submit']")).click();
	    }
	    
	    @AfterTest
	    public void close() { 	
        driver.close();
	    }
	}


