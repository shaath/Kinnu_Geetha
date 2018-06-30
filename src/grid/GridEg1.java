package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg1 
{
	@Parameters({"browser","plotform"})
	@Test
	public void gg(String br,String pt) throws MalformedURLException
	{
		System.out.println(br+"---"+pt);
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("windows"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("windows"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"), cap);

		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}
