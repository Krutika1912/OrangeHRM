package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserPage extends BasePage{

	@FindBy(className="oxd-main-menu-item active toggle")
	private WebElement Adminbtn;
	
	@FindBy(xpath="//span[text()=\"User Management \"]")
	private WebElement Usrmngt;
	
	@FindBy(xpath="//a[text()=\"Users\"]")
	private WebElement users;
	
	@FindBy(xpath="//button[text()=\" Add \"]")
	private WebElement addbtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
	private WebElement Usrrole;
	
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	private WebElement EmpName;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	private WebElement Status;
	 
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	private WebElement Usrname;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	private WebElement psword;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	private WebElement cnfpsword;
	
	@FindBy(className="oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space")
	private WebElement Save;
	
	public void Admin()
	{ 
		Adminbtn.click();
	}
	public void usermng()
	{ 
		Usrmngt.click();
	}
	public void Users()
	{ 
		users.click();
	}
	public void Addbtn()
	{ 
		addbtn.click();
	}
	public void UserRole()
	{ 
		Select drpdwn=new Select(Usrrole);
		drpdwn.selectByIndex(2);
	}
	public void EmpName(String str)
	{ 
		EmpName.sendKeys(str);
	}
	public void Status()
	{ 
		Select drpdwn=new Select(Status);
		drpdwn.selectByIndex(2);
	}
	public void UsrNme(String str1)
	{ 
		Usrname.sendKeys(str1);
	}
	public void Password(String str2)
	{ 
		psword.sendKeys(str2);
	}
	public void CnfPassword(String str3)
	{ 
		cnfpsword.sendKeys(str3);
	}
	public void Savebtn()
	{ 
		Save.click();
	}
	
}
