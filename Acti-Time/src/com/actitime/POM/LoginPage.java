package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListernerClass.class)
public class LoginPage extends BaseClass{
	
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name ="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin(String un,String pwd) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbtn.click();
	}
	
	

}
