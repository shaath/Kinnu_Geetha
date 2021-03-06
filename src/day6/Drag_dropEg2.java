package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Drag_dropEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		
		Actions act=new Actions(driver);

		act.dragAndDropBy(drag, 259, 140).build().perform();
		
		
	}

}
