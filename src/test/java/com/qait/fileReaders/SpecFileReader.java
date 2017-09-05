/*
 * 
 */
package com.qait.fileReaders;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qait.pages.BasePage;
// TODO: Auto-generated Javadoc
/** 
 * This class contains all the necessary methods to read the spec file containing the locators (name,type and value ) and
 * takes selenium WebDriver instance as constructor argument.
 * @author shivambharadwaj
 * @since 1.8
 * 
 * */
public class SpecFileReader {
	
	/** The driver. */
	static WebDriver driver;

	/**
	 * Instantiates a new spec file reader.
	 *
	 * @param driver the driver
	 */
	public SpecFileReader(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 *  
	 * This method contains all the necessary steps to read the spec file containing the locators (name,type and value ).
	 * The Scanner class reads spec file line by line and split it based upon the regular expression.
	 * It passes the locator type and locator value to the @generateLocators(arg1,arg2) merhod which returns By.
	 *
	 * @param locator the locator
	 * @return the web element
	 */
	public static WebElement findLocator(String locator) {
		
		String fileName = "D:\\MyWorkspace\\QAIT-Automation-Framework\\resources\\specs\\mmt.spec";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()) {
				String[] values = scanner.nextLine().split("\\t\\s{2,}");
				if (values[0].equals(locator)) {
					return driver.findElement(generateLocators(values[1], values[2]));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 *  
	 * This method contains all the necessary steps to manupulate the locator type and value.
	 * A switch statement returns the By according to the Locator type.
	 *
	 * @param type the type
	 * @param value the value
	 * @return the by
	 */
	public static By generateLocators(String type, String value) {

		switch (type.toUpperCase()) {

		case "CSS":
		case "CSSSELECTOR":
			return By.cssSelector(value);
		case "XPATH":
			return By.xpath(value);
		case "PARTIALTEXT":
			return By.partialLinkText(value);
		case "LINKTEXT":
			return By.linkText(value);
		case "ID":
			return By.id(value);
		case "NAME":
			return By.name(value);
		case "CLASSNAME":
			return By.className(value);
		default:
			return null;
		}

	}
}
