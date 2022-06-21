package com.app.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.paulhammant.ngwebdriver.*;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Angular {
	
	static WebDriver driver;
	@ByAngularModel.FindBy(model = "first") static WebElement txtfield1;
	@ByAngularModel.FindBy(model = "second") static WebElement txtfield2;
	@ByAngularButtonText.FindBy(buttonText="Go!")
	static WebElement button;
	public Angular (WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements (driver, this);
	}
	public static void main(String args[]) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	NgWebDriver ngDriver=new NgWebDriver(js);
	driver.get("https://juliemr.github.io/protractor-demo/"); 
	ngDriver.waitForAngularRequestsToFinish();
	txtfield1.sendKeys("2");
	txtfield2.sendKeys("3");
	button.click();
	}
	
	}

