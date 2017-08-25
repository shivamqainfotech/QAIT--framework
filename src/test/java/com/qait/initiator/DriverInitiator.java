package com.qait.initiator;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitiator {

	private static ResourceBundle rs = ResourceBundle.getBundle("config");
	private WebDriver driver;
	
	public WebDriver getDriver() {
		
		if(rs.getString("browser").equalsIgnoreCase("chrome")){
			return getChromeDriver();
		}
		
		return driver;
		
	}
	private WebDriver getChromeDriver() {
		System.setProperty(rs.getString("ChromedriverName"), rs.getString("ChromedriverPath"));
		return new ChromeDriver();
	}

}
