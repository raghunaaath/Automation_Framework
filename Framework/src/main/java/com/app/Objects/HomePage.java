package com.app.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebElement registration_link;
	
	public HomePage(WebDriver driver) {
		this.registration_link = driver.findElement(By.partialLinkText("Register"));
	}
	
	public void open_registation_link() {
		registration_link.click();
	}

}
