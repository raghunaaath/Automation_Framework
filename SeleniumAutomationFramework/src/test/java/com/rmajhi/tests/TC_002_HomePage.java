package com.rmajhi.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.rmajhi.Driver.Driver;

public class TC_002_HomePage extends BaseTest{

	@Test
	public void Login() {
		Driver.driver.findElement(By.name("q")).sendKeys("C++",Keys.ENTER);
	}

}
