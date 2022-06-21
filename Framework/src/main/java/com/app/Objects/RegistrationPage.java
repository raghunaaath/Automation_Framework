package com.app.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	WebElement gender_radio_button;
	WebElement first_name,last_name;
	
	public RegistrationPage(WebDriver driver) {
		this.gender_radio_button = driver.findElement(By.id("gender-male"));
		this.first_name = driver.findElement(By.name("FirstName"));
		this.last_name = driver.findElement(By.name("LastName"));
	}
	
	public void set_gender() {
		gender_radio_button.click();
	}
	
	public void set_firstName(String firstName) {
		first_name.sendKeys(firstName);
	}
	
	public void set_lastname(String lastName) {
		last_name.sendKeys(lastName);
	}

}
