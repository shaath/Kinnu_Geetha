package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement b=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> checks=b.findElements(By.tagName("input"));
		
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) 
		{
			String text=checks.get(i).getAttribute("value");
			System.out.println(text+"---->"+checks.get(i).isSelected());
			
			if (!checks.get(i).isSelected())
			{
				checks.get(i).click();
			}
		}
		
	}

}
