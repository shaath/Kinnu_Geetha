package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println("The number of links avaialble in google page is: "+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String ltext=links.get(i).getText();
			
			if (!ltext.equals(""))
			{
				System.out.println(ltext);
				count++;
			}
		}
		
		System.out.println("The number of visible links count: "+count);
	}

}
