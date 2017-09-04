package com.qait.initiator;

import org.openqa.selenium.WebDriver;

import com.qait.actions.LoginPageActions;
import com.qait.fileReaders.SpecFileReader;
import com.qait.fileReaders.YamlReaderClass;

public class TestInitiator {

	private WebDriver driver;
	public LoginPageActions loginPageActions;
	public YamlReaderClass yr;
	public SpecFileReader specFileReader;
	
	public TestInitiator(){
		driver= (new DriverInitiator().getDriver());
		initPages();
	}

	private void initPages() {
		loginPageActions = new LoginPageActions(driver);
		 yr=new YamlReaderClass();
		 specFileReader=new SpecFileReader(driver);
	}
	
	public void openUrl(String URL){
		 driver.manage().window().maximize();
		 driver.get(URL);
	}
	public void closeBrowser(){
		driver.close();
	}
	public void currentTest(String name){
		System.out.println("----------------------------------------------------------------");
		System.err.println("++++++++++++ "+name+" +++++++++++++++");
		System.out.println("----------------------------------------------------------------");
	}
}
