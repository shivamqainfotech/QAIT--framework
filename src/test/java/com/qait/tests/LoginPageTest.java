package com.qait.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.fileReaders.YamlReaderClass;
import com.qait.initiator.TestInitiator;

public class LoginPageTest {

	private TestInitiator test;
	
	@BeforeClass
	
	public void oneTimeSetUp() {
        test=new TestInitiator();
        test.openUrl(YamlReaderClass.getYamlData("app_url"));
        test.currentTest(this.getClass().getSimpleName());
        
	}
	@Test (priority=1)
	public void ckickOnHotel(){		
		test.loginPageActions.clickOnHotel("btn_hotel");
	}
	@Test (priority=2)
	public void searchForHotel(){		
		test.loginPageActions.searchForHotel("bar_search");
		test.loginPageActions.enterCity("bar_search","Gwalior");
	}
	@Test (priority=3)
	public void clickSearchButton(){		
		test.loginPageActions.ckickSearchButton("btn_search");
	}
	@Test (priority=4)
	public void clickPriceButton(){		
		test.loginPageActions.clickPriceButton("txt_price");
		test.loginPageActions.selectPrice("btn_range");
	}
	
	@AfterClass
   public void tearDown(){
		test.closeBrowser();
		
	}
	
	
	
}
