package TrainingPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxAutoSuggests {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		WebElement block = driver.findElement(By.xpath("//div[@class='sbdd_b']/div/ul"));
		List<WebElement> ajax = block.findElements(By.tagName("li"));
		System.out.println(ajax.size());
		
		for(int i = 0 ; i< ajax.size();i++)
		{
		 System.out.println(ajax.get(i).getText());      
		}
		driver.close();
		
		
		
	
		}

}
