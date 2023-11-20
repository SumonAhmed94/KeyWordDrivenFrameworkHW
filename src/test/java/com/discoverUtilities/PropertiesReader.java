package com.discoverUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
Properties prop;

public PropertiesReader() {
	prop=new Properties();
	String propertyfile="src/test/resources/test.properties";
	
	try {
		FileInputStream fis= new FileInputStream("src/test/resources/test.properties");
		prop.load(fis);
	} catch (IOException e) {

		e.printStackTrace();
	}
}
	public String readbrowser() {
		return prop.getProperty("browser");
}
	public String getUrl() {
		return prop.getProperty("url");
	}
	public String UserName() {
		return prop.getProperty("username");
	}
	public String Password() {
		return prop.getProperty("password");
	}
	public static void main(String[] args) {
		PropertiesReader pr=new PropertiesReader();
		String browserName= pr.readbrowser();
		
}
}


