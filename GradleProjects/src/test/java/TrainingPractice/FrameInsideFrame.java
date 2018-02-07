package TrainingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameInsideFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(Source, Target).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
