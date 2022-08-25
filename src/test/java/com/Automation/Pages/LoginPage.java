package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(name="username")
	private WebElement userInput;
	
	@FindBy(name="password")
	private WebElement passwordInput;
	
	@FindBy(xpath="//button[text()=\" Login \"]")
	private WebElement loginButton;
	
	
	public void enterUsername(String username)
	{
		userInput.sendKeys(username);
		
		
	}
	
	public void enterPassword(String password)
	{
		passwordInput.sendKeys(password);
		
		
	}
	
	
	
	public void clickbtnLogin()
	{
		loginButton.click();
	}
}
