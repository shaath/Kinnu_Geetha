package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		Sleeper.sleepTightInSeconds(5);
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		
//		alt.dismiss();
//		alt.sendKeys("Yes");
	}

}
