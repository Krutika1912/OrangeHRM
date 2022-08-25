package com.Automation.StepDef;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.LoginPage;
import com.Automation.Pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps {
    UserPage up=new UserPage();
    LoginPage lp=new LoginPage();
	/*@Given("Open the browser")
	public void open_the_browser() {
	    DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		lp.enterUsername(PropertyReader.getProperty("username"));
		lp.enterPassword(PropertyReader.getProperty("password"));
		lp.clickbtnLogin();
	}
    
    @Then("Click on Admin,User management,Users ,Add")
	public void click_on_admin_user_management_users_add() {
	   up.Admin();
	   up.usermng();
	   up.Users();
	   up.Addbtn();
	}*/
}
