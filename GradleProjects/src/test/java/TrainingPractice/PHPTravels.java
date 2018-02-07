package TrainingPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PHPTravels {

	public static void main(String[] args) throws InterruptedException {
		
		//TC:01
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/admin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver. findElement(By.xpath("html/body/div[1]/form[1]/button")).click();
		Thread.sleep(8000);
	  	driver.findElement(By.xpath("//a[contains(.,'CMS')]")).click();
	  	driver.findElement(By.xpath("//a[contains(.,'Pages')]")).click();	
	  	driver.findElement(By.xpath("//table[@class='xcrud-list table table-striped table-hover']/tbody/tr[1]/td[7]/span/a[@title='Edit']")).click();
		driver.findElement(By.name("pagetitle")).clear();
		driver.findElement(By.name("pagetitle")).sendKeys("Swathi");
		driver.findElement(By.xpath(".//*[@id='content']/div/form/div/div[2]/button")).click();
		driver.close();
	  
		/*				
		//TC:02
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(.,'Accounts')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(.,'Admins')]")).click();
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
	    driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
	    Thread.sleep(4000);
	    driver.quit();
	    */
	    
	   
	  //TC:03
	  	

	}

}
