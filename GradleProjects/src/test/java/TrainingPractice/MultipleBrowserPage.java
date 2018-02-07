package TrainingPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.className("gsfi")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		driver.getWindowHandles();
		List<WebElement> mylinks = driver.findElements(By.className("r"));
		System.out.println(mylinks.size());
		for(int i = 0; i<mylinks.size() ; i++) {
			
			System.out.println(mylinks.get(i).getText());
			
			
			
		}

	}

}
