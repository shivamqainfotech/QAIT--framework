/*
 * 
 */
package com.qait.initiator;

import org.openqa.selenium.WebDriver;
import com.qait.actions.MmtPageActions;
import com.qait.fileReaders.SpecFileReader;
import com.qait.fileReaders.YamlReaderClass;
import com.qait.pages.BasePage;
// TODO: Auto-generated Javadoc

/**
 *  
 * This class contains all the primary actions(methods) needed prior to execute the test suite and
 * takes selenium WebDriver instance as constructor argument.
 * This class initializes all the Action classes at once 
 *
 * @author shivambharadwaj
 * @see BasePage
 * @since 1.8
 */
public class TestInitiator {

	/** The driver. */
	public WebDriver driver;
	
	/** The mmt page actions. */
	public MmtPageActions mmtPageActions;
	
	/** The yr. */
	public YamlReaderClass yr;
	
	/** The spec file reader. */
	public SpecFileReader specFileReader;
	
	/**
	 * This constructor contains all the primary actions classes needed prior the execution of the test suite
	 * 
	 * This also initializes all the Action classes at once .
	 */
	public TestInitiator(){
		driver= (new DriverInitiator().getDriver());
		initPages();
	}
	/**
	 * This method initializes all the action classes required for the execution of test.
	 * */
	public void initPages() {
		mmtPageActions = new MmtPageActions(driver);
		 yr=new YamlReaderClass();
		 specFileReader=new SpecFileReader(driver);
	}
	
	/**
	 * This method open up the URL on Web Browser.
	 *
	 * @param URL the url
	 */
	public void openUrl(String URL){
		 driver.manage().window().maximize();
		 driver.get(URL);
	}
	/**
	 * This method is used at the termination for closing the Web Browser.
	 * 
	 * */
	public void closeBrowser(){
		System.out.println("Closing browser....! \n========================== B Bye! ======================================");
		driver.close();
	}
	
	/**
	 * This method tells Quality Engineers the name of currently executing test class.
	 *
	 * @param name the name
	 */
	public void currentTest(String name){
		System.err.println("----------------------------------------------------------------\n++++++++++++ You are at : "
	                       +name+" +++++++++++++++\n----------------------------------------------------------------");
		
	}
}
