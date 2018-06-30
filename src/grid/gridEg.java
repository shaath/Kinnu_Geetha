package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class gridEg 
{
	@Test
	public void g() throws MalformedURLException
	{
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"), cap);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("h");
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> cities=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++)
		{
			String c=cities.get(i).getText();
			System.out.println(c);
			if (c.equalsIgnoreCase("hosur"))
			{
				cities.get(i).click();
				break;
			}
		}
		
		
	}

}
