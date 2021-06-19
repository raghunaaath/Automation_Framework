package com.rmajhi.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.rmajhi.Driver.Driver;

public class TC_001_Login extends BaseTest {


	@Test
	public void Login() {
		
		Driver.getDriver().findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	}


}
