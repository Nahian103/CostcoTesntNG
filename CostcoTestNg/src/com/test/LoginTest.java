package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LogIn;

public class LoginTest extends Base {
	


	@Test
	public void loginTest() {
		driver.get("https://www.costco.com/");
		LogIn loginPage = new LogIn(driver);
		loginPage.login("natenycstandard@gmail.com", "@Nahian103");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	//@Test
	//public void negativeLoginTest() {
		//driver.get("https://www.costco.com/");
		//LogIn loginPage = new LogIn(driver);
		//loginPage.login("natenycstandard@gmail.com", "@nahian000");

		//WebElement errorMsg = driver.findElement(By.cssSelector(".error-message-container.error"));
		//Assert.assertEquals(errorMsg.isDisplayed(), true);
	}

           b