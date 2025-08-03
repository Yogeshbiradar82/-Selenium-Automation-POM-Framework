package com.actitime.testsript;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListernerClass.class)
public class Customer extends BaseClass{
	
	@Test(priority=0)
	public void create() {
		HomePage h=new HomePage(driver);
		h.settask();
		TaskListPage tp=new TaskListPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcustomer().click();
		tp.getCustomername().sendKeys("HDFC-001");
		tp.getCustomerdescription().sendKeys("banking operation");
		//tp.getCutomerdropdown().click();
		//tp.getSelectcutomer().click();
		//tp.getSelectcutomer().click();
		tp.getCreatecustomer().click();
	}
	
	@Test(priority=1)
	public void Project() {
		HomePage h1=new HomePage(driver);
		h1.settask();
		TaskListPage tp1=new TaskListPage(driver);
		tp1.getAddnewbtn().click();
		tp1.getNewprojectbtn().click();
		tp1.getProjectname().sendKeys("Banking operation");
		tp1.getProjectdescription().sendKeys("Transactions");
		tp1.getAddtask1().sendKeys("Deposite");
		tp1.getAddtask2().sendKeys("Withdraw");
		tp1.getCreateproject().click();
	}
	

}
