package com.qait.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.initiator.TestInitiator;

public class LoginPageTest {

	private TestInitiator test;
	
	@BeforeClass
	
	public void oneTimeSetUp() {
        test=new TestInitiator();
	}
	
	@Test (priority=1)
	public void openUrl(){
		test.loginPageActions.openUrl();
	}
	
	@Test (priority=2)
	public void loginWithValidCredentialsAndVerify(){
		
		
	}
	
	
	
}
