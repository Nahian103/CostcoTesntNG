package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn1 {

WebDriver driver;
	
	public LogIn1(WebDriver driver) {
		this.driver = driver;
	}
	
//login1


	public void login(String userName, String password) {
	

		driver.findElement(By.id("header_sign_in")).click();
		driver.findElement(By.id("signInName")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html//button[@id='next']")).click();
	}

	}

