package com.qait.actions;

import org.openqa.selenium.WebDriver;

import com.qait.pages.GetPage;

public class LoginPageActions extends GetPage {

	public LoginPageActions(String specName, WebDriver driver) {
		super(specName, driver);
		
		// TODO Auto-generated constructor stub
	}

	public void openUrl() {
		driver.get("https://www.makemytrip.com/");
		
	}

}
