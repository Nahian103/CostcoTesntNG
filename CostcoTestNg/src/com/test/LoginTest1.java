package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LogIn1;

public class LoginTest1 extends Base {
	
//okay 

	@Test
	public void loginTest() {
		driver.get("https://www.costco.com/");
		LogIn1 loginPage = new LogIn1(driver);
		loginPage.login("natenycstandard@gmail.com", "@Nahian103");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	
	}

