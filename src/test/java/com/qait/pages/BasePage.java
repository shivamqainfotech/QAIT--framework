package com.qait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String logMessage(String message) {
		System.out.println(message);
		return message;
	}

	public void sendText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
		logMessage("User entered '" + text + "' in the text field");
		
	}

	public void click(WebElement element) {
		if(isElementDisplayed(element)){
		element.click();
		}else{
			logMessage("Oops!Element '"+element+"'  is not displayed");
		}
		logMessage("User clicked on '" + element+ "' Button");

	}

	public boolean isElementDisplayed(WebElement el) {
		if (el.isDisplayed()) {
			logMessage("Element '" + el + "' is displayed.");
			return el.isDisplayed();
		}
		return false;
	}
	public void hardWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			System.err.println("Oops!Exception occured in hard wait.");
			e.printStackTrace();
		}
	}
	

}
