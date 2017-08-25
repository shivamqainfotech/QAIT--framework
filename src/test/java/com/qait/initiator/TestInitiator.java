package com.qait.initiator;

import org.openqa.selenium.WebDriver;

import com.qait.actions.LoginPageActions;

public class TestInitiator {

	private WebDriver driver;
	public LoginPageActions loginPageActions;
	
	public TestInitiator(){
		driver= (new DriverInitiator().getDriver());
		initPages();
	}

	private void initPages() {
		loginPageActions = new LoginPageActions("spec", driver);
		
	}
}
