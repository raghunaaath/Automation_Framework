package com.rmajhi.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rmajhi.constants.FrameworkConstants;

public class Driver {

	private static WebDriver driver;
	private static ThreadLocal<WebDriver> dr = new ThreadLocal();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver driverRef) {
		dr.set(driverRef);
	}

	public static void unloadDriver() {
		dr.remove();
	}

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromedriverPath());
		driver = new ChromeDriver();
		setDriver(driver);
		driver.get("https://google.com");
	}

	public static void quitDriver() {
		getDriver().quit();
		unloadDriver();
	}

}