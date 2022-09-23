package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

WebDriver driver;
	
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	



	public void register(String userName, String password, String confirm) {
		driver.findElement(By.id("header_sign_in")).click();
		driver.findElement(By.id("createAccount")).click();
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("newPassword")).sendKeys(password);
		driver.findElement(By.id("reenterPassword")).sendKeys(password);
		driver.findElement(By.id("continue")).click();
	}
}	