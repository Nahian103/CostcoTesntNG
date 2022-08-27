package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

WebDriver driver;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	



	public void login(String userName, String password) {
	

		driver.findElement(By.id("header_sign_in")).click();
		driver.findElement(By.id("signInName")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html//button[@id='next']")).click();
	}

	}

