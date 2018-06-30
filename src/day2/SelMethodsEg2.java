package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SelMethodsEg2 {

	public static void main(String[] args)
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
//		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().to("http://gmail.com");
		
//		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().back();
		
//		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().forward();
		
//		Sleeper.sleepTightInSeconds(5);
		
		driver.navigate().refresh();
	}

}
