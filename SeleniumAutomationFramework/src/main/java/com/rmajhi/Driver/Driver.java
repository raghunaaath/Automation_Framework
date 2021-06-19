package com.rmajhi.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rmajhi.constants.FrameworkConstants;

public class Driver {
	
	public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromedriverPath());
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	public static void quitDriver() {
		driver.quit();
	}

}
