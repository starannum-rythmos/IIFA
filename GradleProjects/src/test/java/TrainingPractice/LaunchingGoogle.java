package TrainingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingGoogle {
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium Webdriver\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();
		
		
	}

}
