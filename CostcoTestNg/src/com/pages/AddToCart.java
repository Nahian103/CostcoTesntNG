package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;  
	}
	public void ItemToCart() {
	 
		driver.findElement(By.id("add-to-cart-btn")).click();
		

}  }                              