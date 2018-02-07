package SeleniumPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumpoint.com/testwebsite.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("remail")).sendKeys("test@seleniumpoint.com ");
		driver.findElement(By.id("rpassword")).sendKeys("test@123");
		driver.findElement(By.id("rsubmit")).click();
		
		
		
		
	}

}
