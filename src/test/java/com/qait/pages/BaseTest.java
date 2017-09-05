/*
 * 
 */
package com.qait.pages;

import static com.qait.fileReaders.YamlReaderClass.getYamlData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qait.initiator.TestInitiator;

// TODO: Auto-generated Javadoc
/** 
 * @author shivambharadwaj
 * This is the parent class for all other test classes. 
 * This class contains all the necessary tests to be performed upon the web page
 * @since 1.8
 * 
 * 
 * */
public class BaseTest {

/** The test. */
public TestInitiator test;
	
	/**
	 * One time set up.
	 */
	@BeforeClass
	/** 
	 * This method is invoked prior to the test execution.
	 * This method is a one time set up which loads all the action classes, app url and the name of test to be executed.
	 * 
	 * */
	public void oneTimeSetUp() {
        test=new TestInitiator();
        test.openUrl(getYamlData("app_url"));
        test.currentTest(this.getClass().getSimpleName());
        
	}
	/** 
	 * This method is invoked after  the test execution is completed.
	 * This method basically cleans the resources and close the browser.
	 * 
	 * */
	@AfterClass
	   public void tearDown(){
			test.closeBrowser();
			
		}
}
