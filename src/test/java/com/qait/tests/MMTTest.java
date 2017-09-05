/*
 * 
 */
package com.qait.tests;

import org.testng.annotations.Test;

import com.qait.pages.BaseTest;

import static com.qait.fileReaders.YamlReaderClass.getYamlData;
// TODO: Auto-generated Javadoc
/** This is the consumer class that uses all other classes. Each and every test will 
 * be written here and actions are invoked from Action classes.
 * This class contains all the necessary tests to be performed upon the web page  * @author shivambharadwaj
 * @since 1.8
 * 
 * 
 * */
public class MMTTest extends BaseTest {
	
	/** 
	 * This is a simple test with @priority=1
	 * This test case passes the locator name as written in spec file and corresponding 
	 * action class clicked on that element.
	 * 
	 * */
	
	@Test (priority=1)
	public void ckickOnHotel(){		
		test.mmtPageActions.clickOnHotel("btn_hotel");
	}
	/** 
	 * This is a simple test with @priority=2
	 * This test case passes the locator name as written in spec file,city name as it written in YAML file and corresponding 
	 * action class clicked on that element.
	 * 
	 * */
	@Test (priority=2)
	public void searchForHotel(){		
		test.mmtPageActions.searchForHotel("bar_search");
		test.mmtPageActions.enterCity("bar_search",getYamlData("city"));
	}
	/** 
	 * This is a simple test with @priority=3
	 * This test case passes the locator name as written in spec file and corresponding 
	 * action class clicked on that element.
	 * 
	 * */
	@Test (priority=3)
	public void clickSearchButton(){		
		test.mmtPageActions.ckickSearchButton("btn_search");
	}
	/** 
	 * This is a simple test with @priority=4
	 * This test case passes the locator name as written in spec file and corresponding 
	 * action class clicked on that element.
	 * 
	 * */
	@Test (priority=4)
	public void clickPriceButton(){		
		test.mmtPageActions.clickPriceButton("txt_price");
		test.mmtPageActions.selectPrice("btn_range");
	}

}
