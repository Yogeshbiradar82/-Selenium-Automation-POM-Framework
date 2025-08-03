package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListernerClass.class)
public class TaskListPage extends BaseClass{
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customername;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement cutomerdropdown;
	
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectcutomer;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustomer;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newprojectbtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement projectname;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectdescription;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement addtask1;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[2]")
	private WebElement addtask2;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createproject;
	
	public WebElement getNewprojectbtn() {
		return newprojectbtn;
	}

	public WebElement getProjectname() {
		return projectname;
	}

	public WebElement getProjectdescription() {
		return projectdescription;
	}

	public WebElement getAddtask1() {
		return addtask1;
	}

	public WebElement getAddtask2() {
		return addtask2;
	}

	public WebElement getCreateproject() {
		return createproject;
	}

	public TaskListPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCustomerdescription() {
		return customerdescription;
	}

	public WebElement getCutomerdropdown() {
		return cutomerdropdown;
	}

	public WebElement getSelectcutomer() {
		return selectcutomer;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}
	
	
	
	


	

}
