package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Admin";
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void Org_Login(String u, String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}

}
