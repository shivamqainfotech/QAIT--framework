package com.qait.actions;

import org.openqa.selenium.WebDriver;

import com.qait.fileReaders.SpecFileReader;
import com.qait.pages.GetPage;

public class LoginPageActions extends GetPage {
	
	public LoginPageActions(WebDriver driver) {
		super(driver);
		
	}
	public void clickOnHotel(String locator) {
		click(SpecFileReader.findLocator(locator));
	}
	public void searchForHotel(String locator) {
		hardWait(3);
		click(SpecFileReader.findLocator(locator));
	}
	public void enterCity(String locator,String city) {
		hardWait(3);
		sendText(SpecFileReader.findLocator(locator), city);
	}
	public void ckickSearchButton(String locator) {
		hardWait(3);
		click(SpecFileReader.findLocator(locator));
	}
	public void clickPriceButton(String locator) {
		hardWait(3);
		click(SpecFileReader.findLocator(locator));		
	}
	public void selectPrice(String locator) {
		hardWait(3);
		click(SpecFileReader.findLocator(locator));		
		
	}

}
