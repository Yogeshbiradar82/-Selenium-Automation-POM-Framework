package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListernerClass.class)
public class HomePage extends BaseClass {
	
	@FindBy(id = "container_tasks")
	private WebElement taskbtn;
	
	@FindBy(id = "logoutLink")
	private WebElement lgobtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void settask() {
		taskbtn.click();
	}
	
	public void setlogout() {
		lgobtn.click();
	}

}
