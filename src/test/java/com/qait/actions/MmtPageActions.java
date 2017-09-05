/*
 * 
 */
package com.qait.actions;

import org.openqa.selenium.WebDriver;

import com.qait.fileReaders.SpecFileReader;
import com.qait.pages.BasePage;
// TODO: Auto-generated Javadoc

/**
 *  
 * This class contains all the necessary actions(methods) to be performed upon this web page and
 * takes selenium WebDriver instance as constructor argument.
 *
 * @author shivambharadwaj
 * @see BasePage
 * @since 1.8
 */
public class MmtPageActions extends BasePage {
	
	/**
	 * Instantiates a new mmt page actions.
	 *
	 * @param driver the driver
	 */
	public MmtPageActions(WebDriver driver) {
		super(driver);
		
	}
	
	/**
	 *  
	 * This method takes locator as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 */
	public void clickOnHotel(String locator) {
		hardWait(5);
		click(SpecFileReader.findLocator(locator),locator);
	}
	
	/**
	 *  
	 * This method takes locator as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 */
	public void searchForHotel(String locator) {
		hardWait(5);
		click(SpecFileReader.findLocator(locator),locator);
	}
	
	/**
	 *  
	 * This method takes locator and city as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 * @param city the city
	 */
	public void enterCity(String locator,String city) {
		hardWait(5);
		sendText(SpecFileReader.findLocator(locator), city);
	}
	
	/**
	 *  
	 * This method takes locator as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 */
	public void ckickSearchButton(String locator) {
		hardWait(5);
		click(SpecFileReader.findLocator(locator),locator);
	}
	
	/**
	 *  
	 * This method takes locator as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 */
	public void clickPriceButton(String locator) {
		hardWait(5);
		click(SpecFileReader.findLocator(locator),locator);		
	}
	
	/**
	 *  
	 * This method takes locator as input and pass it away to the @findLocator method. Which in returns a WebElement.
	 * This WebElement than passed as parameter to the @click() method along with String locator.
	 *
	 * @param locator the locator
	 */
	public void selectPrice(String locator) {
		hardWait(6);
		click(SpecFileReader.findLocator(locator),locator);		
		
	}
	


}
