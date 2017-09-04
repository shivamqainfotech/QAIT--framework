package com.qait.fileReaders;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecFileReader {
	static WebDriver driver;

	public SpecFileReader(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement findLocator(String locator) {
		String fileName = "D:\\MyWorkspace\\QAIT-Automation-Framework\\resources\\specs\\loginpage.spec";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()) {
				String[] values = scanner.nextLine().split("\\t\\s{2,}");
				if (values[0].equals(locator)) {
					// System.out.println(values[1]);
					// System.out.println(values[2]);
					return driver.findElement(generateLocators(values[1], values[2]));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

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

	/*public static void main(String args[]) {
		findLocator("btn_hotel");
	}*/
}
