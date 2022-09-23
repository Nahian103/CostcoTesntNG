package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Category {
WebDriver driver;
	
	public Category(WebDriver driver) {
		this.driver = driver;
}
	public void category() {
		driver.findElement(By.id("navigation-dropdown")).click();
	}
}