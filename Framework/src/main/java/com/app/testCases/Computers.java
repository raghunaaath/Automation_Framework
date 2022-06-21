package com.app.testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.app.ManageDriver.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Computers {

	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		int broken_Link_Count=0;

		driver = new ChromeDriver();
		driver.get("https://google.co.in/");
		driver.manage().window().maximize();
		
		String HomePage = "https://google.co.in/";
		
		driver.get(HomePage);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("FIS");
		element.sendKeys(Keys.ENTER);
		//Actions action = new Actions(driver);
		
		//action.click(driver.findElement(By.partialLinkText("Images"))).build().perform();
		
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement link : links) {
	
			String url = link.getAttribute("href");
			
			if(url!=null && !url.isEmpty()) {
				broken_Link_Count++;
			}
			
			System.out.println(broken_Link_Count);
			
			if(url.startsWith(HomePage)) {
				System.out.println(link.getText()+" is a broken link");
			}
			
		}
	}

}
