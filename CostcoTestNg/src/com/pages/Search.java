package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	WebDriver driver;
	
	public Search(WebDriver driver) {
		this.driver = driver;
}
	public void search(String desired) {
		driver.findElement(By.id("search-field")).sendKeys(desired);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[2]/div/div[3]/div/form/div[2]/button")).click();
		
}	
}