package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.actitime.POM.HomePage;
import com.actitime.POM.LoginPage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(com.actitime.generic.ListernerClass.class)
public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static ChromeDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("close Browser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
		driver.get("http://localhost/login.do");
	    //driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setlogin("admin","manager");
		
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setlogout();
	
	}
	

}
