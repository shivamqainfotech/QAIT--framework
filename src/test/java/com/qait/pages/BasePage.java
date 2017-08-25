package com.qait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
    protected WebDriver driver;
    protected String specName;

    public BasePage(String specName, WebDriver driver)
    {
        this.specName = specName;
        this.driver = driver;
    }
    
    public String getPageTitle()
    {
        return driver.getTitle();
    }
    
    public String logMessage(String message)
    {
        System.out.println(message);
        return message;
    }

    public void sendText(WebElement el, String text)
    {
        el.clear();
        el.sendKeys(text);
    }
    
    public void click(WebElement element)
    {
            element.click();
            System.out.println("User clicked on '"+element+"' Button");
       
    }
    public boolean isElementDisplayed(WebElement el)
    {
    	if(el.isDisplayed()){
    		System.out.println("Element '"+el+"' is displayed.");
        return el.isDisplayed();
    	}
		return false;
    }

}
