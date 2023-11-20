package com.discoverBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.discoverUtilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
PropertiesReader pr;

public void openApp() {
	pr=new PropertiesReader();
	String browser=pr.readbrowser();
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("Edge") ) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	else if (browser == "Firefox") {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
}
	else { 
		System.out.println("Chrome is running as default");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(pr.getUrl());
}
public void closeApp() {
	if (driver != null) { 
		driver.quit();
}
}
}