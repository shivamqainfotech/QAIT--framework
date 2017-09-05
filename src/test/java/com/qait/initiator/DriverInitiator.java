/*
 * 
 */
package com.qait.initiator;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qait.pages.BasePage;
// TODO: Auto-generated Javadoc
/** 
 * This class contains all the necessary methods to initiate WebDriver.
 * @author shivambharadwaj
 * @since 1.8
 * 
 * */
public class DriverInitiator {

	/** The rs. */
	public static ResourceBundle rs = ResourceBundle.getBundle("config");
	
	/** The driver. */
	public WebDriver driver;
	/** 
	 * This method reads the config file and returns the browser spesific driver.
	 * @return ChromeDriver(), FirefoxDriver(),IEDriver 
	 * */
	public WebDriver getDriver() {

		switch (rs.getString("browser").toUpperCase()) {

		case "CHROME":
			return getChromeDriver();

		case "FIREFOX":
			return getFirefoxDriver();

		case "IE":
			return getIEDriver();
		
         default:
		      return driver;

	}
	}
	/** 
	 * This method reads ChromedriverName and ChromedriverPath from the config file and returns chromedriver.
	 * @return ChromeDriver()
	 * */
	public WebDriver getChromeDriver() {
		System.setProperty(rs.getString("ChromedriverName"), rs.getString("ChromedriverPath"));
		return new ChromeDriver();
	}
	/** 
	 * This method reads FirefoxdriverName , FirefoxdriverPath and the binary path of firefox from the config file and returns firefoxdriver.
	 * @return FirefoxDriver()
	 * */
	public WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.firefox.bin",
				"C:\\Users\\shivambharadwaj\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		System.setProperty(rs.getString("FirefoxdriverName"), rs.getString("FirefoxdriverPath"));
		return new ChromeDriver();
	}
	/** 
	 * This method reads IEdriverName and IEdriverPath from the config file and returns IEdriver.
	 * @return IEDriver()
	 * */
	public WebDriver getIEDriver() {
		System.setProperty(rs.getString("IEdriverName"), rs.getString("IEdriverPath"));
		return new ChromeDriver();
	}

}
