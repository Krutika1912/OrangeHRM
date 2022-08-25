package com.Automation.StepDef;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage lp=new LoginPage();
	@Given("Open the browser")
	public void open_the_browser() {
	    DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Enter valid username  and Password ")
	public void enter_valid_username_and_password() {
		lp.enterUsername(PropertyReader.getProperty("username"));
		lp.enterPassword(PropertyReader.getProperty("password"));
		lp.clickbtnLogin();
	}
	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		lp.enterUsername(string);
		lp.enterPassword(string2);
		lp.clickbtnLogin();
	}

	@Then("execute successfully")
	public void execute_successfully() {
	   System.out.println(DriverUtils.getDriver().getTitle());
	}
}
