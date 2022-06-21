package com.app.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.app.ManageDriver.DriverManager;
import com.app.Objects.*;
public class Sample {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		DriverManager driverManager = new DriverManager();
		driver = driverManager.setUpDriver();
		
		//driver.findElement(By.partialLinkText("Register")).click();
		HomePage home = new HomePage(driver);
		home.open_registation_link();
		
		RegistrationPage reg = new RegistrationPage(driver);
		reg.set_firstName("Rimmun");
		reg.set_lastname("Panda");
		reg.set_gender();
		
		/*driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Raghunath");
		driver.findElement(By.name("LastName")).sendKeys("Majhi");*/
		
		WebElement date = driver.findElement(By.name("DateOfBirthDay"));
		Select selectDate = new Select(date);
		
		selectDate.selectByIndex(23);
		
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select selectMonth = new Select(month);
		
		selectMonth.selectByIndex(12);
		
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select selectYear = new Select(year);
		
		selectYear.selectByValue("1995");
		
		driver.findElement(By.id("Email")).sendKeys("raghunath.majhi12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456789");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456789");
		driver.findElement(By.id("register-button")).click();
		
		WebElement result = driver.findElement(By.className("result"));
		System.out.println(result.getText());
		
		
		
	}

}
