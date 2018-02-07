package TrainingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingPortal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.get("http://rythmos.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("[@id='email-46f491df-60c4-40b1-8a0d-9489003446c1_234']")).sendKeys("rythmos");
    	//driver.findElement(By.name("firstname")).sendKeys("rythmos");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rythmos");
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("loyalty@rythmos.com");
    	driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Testing Purpose");
    	driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello rythmos ....");
    	driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[@class='recaptcha-checkbox-checkmark']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.className("hs-button primary large")).click();
    	

	}

}
