package TrainingPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames { 

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs");
		driver.manage().window().maximize();
		String Ryt = driver.getWindowHandle();
		List<WebElement> myframes = driver.findElements(By.tagName("frame"));
		System.out.println(myframes.size());
		for(int i = 0 ; i<myframes.size() ; i++)
		{
        System.out.println(myframes.get(i).getText()); 			
		driver.switchTo().frame(i);
		try 
		{
			driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
			break;
		}
			
		catch(Exception e)
		{
			driver.switchTo().window(Ryt);
		}
		}
		
		driver.close();

	}

}
