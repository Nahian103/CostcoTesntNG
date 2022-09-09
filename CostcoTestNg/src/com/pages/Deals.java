package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deals {

WebDriver driver;
	
	public Deals(WebDriver driver) {
		this.driver = driver;
	}
	
   public void GreatDeals() {
	   
	
	   driver.findElement(By.id("Home_Ancillary_2")).click();;
   }
 
   public void Sort() {
	   driver.findElement(By.id("sort_by"));
	   
   }
   
}