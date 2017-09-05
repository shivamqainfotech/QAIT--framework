/*
 * 
 */
package com.qait.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// TODO: Auto-generated Javadoc
/** 
 * This class contains all the necessary methods to be performed upon any web page and
 * takes selenium WebDriver instance as constructor argument.
 * This class also maintains the logs of each and every action performed on the web page.
 * @author shivambharadwaj
 * @since 1.8
 * 
 * 
 * */
public class BasePage {
	
	/** The driver. */
	public WebDriver driver;
	
	/** The Constant logger. */
	final static Logger logger = Logger.getLogger(BasePage.class);
	
	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	public BasePage(WebDriver driver) {

		this.driver = driver;
	}
	/** 
	 * This method returns the title of web page.
	 * @return Title of web page.
	 * 
	 * */
	public String getPageTitle() {
		
		return driver.getTitle();
	
	}
	
	/**
	 *  
	 * This method takes a string message as input and creates logs in Logs/logs.log file.
	 * This message also write the events on console.
	 *
	 * @param message the message
	 */
	public void logMessage(String message) {
		consoleMessage(message);
		logger.info(message);
		
	}
	
	/**
	 *  
	 * This method takes a string message as input and creates error logs in Logs/logs.log file.
	 * This message also write the error  events on console.
	 *
	 * @param message the message
	 */
	public void errorMessage(String message) {
		System.err.println(message);
		logger.error(message);
	}
	
	/**
	 *  
	 * This method takes a string message as input and simply prints that message on console.
	 *
	 * @param message the message
	 */
	public void consoleMessage(String message) {
		System.out.println(message);
		
	}
	
	/**
	 *  
	 * This method takes a @String text and a @WebElement as input and simply sends the test to the location specified by WebElement.
	 * This also prints the event in log file as well as on console.
	 *
	 * @param el the el
	 * @param text the text
	 */
	public void sendText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
		logMessage("User entered '" + text + "' in the text field");

	}
	
	/**
	 *  
	 * This method takes a @String locator and a @WebElement as input and simply click the location specified by @WebElement.
	 * This also prints the event in log file as well as on console.
	 *
	 * @param element the element
	 * @param locator the locator
	 */
	public void click(WebElement element,String locator) {
	       isElementDisplayed((element),locator);
			element.click();

		logMessage("User clicked on '" + locator + "' Button");

	}
	
	/**
	 *  
	 * This method takes a @String locator and a @WebElement as input and simply ckecks the location of element specified by @WebElement.
	 * This also prints the event in log file as well as on console.
	 *
	 * @param el the el
	 * @param locator the locator
	 */
	public void isElementDisplayed(WebElement el,String locator) {
		if (el.isDisplayed()) {
			logMessage("Element '" + locator + "' is displayed.");
			
		}else {
			logMessage("Oops!Element '" + locator + "'  is not displayed");
		}
		
	}
	
	/**
	 *  
	 * This method takes a int seconds as input and simply wait for the next action for the given time.
	 * This also prints the errorMessage on console.
	 *
	 * @param seconds the seconds
	 */
	public void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			errorMessage("Oops!Exception occured in hard wait.");
			e.printStackTrace();
		}
	}
	
	/**
	 *  
	 * This method takes a @int seconds and a @WebElement as input and simply wait untill the visisbility of element specified by @WebElement.
	 * This also prints the event in log file as well as on console.
	 *
	 * @param element the element
	 * @param seconds the seconds
	 * @return the web element
	 */
	public WebElement WaitToLoad(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	
}
