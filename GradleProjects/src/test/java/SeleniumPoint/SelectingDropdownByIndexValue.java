package SeleniumPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDropdownByIndexValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumpoint.com/testwebsite.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Swathi");
		driver.findElement(By.id("mobile")).sendKeys("9248346487");
		driver.findElement(By.id("email")).sendKeys("swathisaripalli@gmail.com");
		driver.findElement(By.id("password")).sendKeys("swa@0216");
		
		
		WebElement dropdown = driver.findElement(By.name("ustate"));
		Select choose = new Select(dropdown);
		
		//method:1
		//choose.selectByIndex(2);
		
		//method:2
		//choose.selectByValue("Andhra Pradesh");
		
		//method:3
		choose.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(3000);
		driver.findElement(By.name("termsCheck")).click();
		driver.findElement(By.id("nsubmit")).click();
		driver.close();
		
		

	}

}
