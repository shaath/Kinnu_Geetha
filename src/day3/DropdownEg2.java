package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=ee1fd9a4ab2943c2a329910e9003a078");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select s=new Select(country);
		
		List<WebElement> list=s.getOptions();
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
//			s.selectByIndex(i);
			String name=list.get(i).getText();
			System.out.println(name);
			s.selectByVisibleText(name);
		}
	}

}
