package com.qait.fileReaders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;



public class YamlReaderClass {

	private static final String FILEPATH="D:\\MyWorkspace\\QAIT-Automation-Framework\\resources\\configs\\AppData.yml";
	private static Map<String, String> obj;
	public YamlReaderClass() {
		try {
			YamlReader reader = new YamlReader(new FileReader(FILEPATH));
			obj=(Map<String, String>) reader.read();
			
		} catch (FileNotFoundException e) {
			System.err.println("Oops!Could not read YAML file...!");
			e.printStackTrace();
		}catch (YamlException e) {
			System.err.println("Oops!Could not read YAML file...!");
			e.printStackTrace();
		}
	
	}	 
	
	public static String getYamlData(String key){
		return (String) obj.get(key);	
	}
}
