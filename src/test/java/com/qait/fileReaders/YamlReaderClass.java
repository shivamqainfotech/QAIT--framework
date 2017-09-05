/*
 * 
 */
package com.qait.fileReaders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

// TODO: Auto-generated Javadoc
/**
 *  
 * This class contains all the necessary methods to read the YAML file containing data in Key,Value pair.
 *
 * @author shivambharadwaj
 * @see SpecFileReader
 * @since 1.8
 */

public class YamlReaderClass {

	/** The Constant FILEPATH. */
	private static final String FILEPATH="D:\\MyWorkspace\\QAIT-Automation-Framework\\resources\\configs\\AppData.yml";
	
	/** The obj. */
	public static Map<String, String> obj;
	
	/**
	 * Instantiates a new yaml reader class.
	 */
	@SuppressWarnings("unchecked")
	/** 
	 * This Constructor contains all the necessary steps to read the YAML file containing data in Key,Value pair.
	 * It parsed the YAML file and reads the value against key.
	 * 
	 * */
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
	
	/**
	 *  
	 * This Method invokes the YAML file containing data in Key,Value pair.
	 * It parsed the YAML file and reads the value against key.
	 *
	 * @param key the key
	 * @return Value
	 */
	public static String getYamlData(String key){
		return (String) obj.get(key);	
	}
}
