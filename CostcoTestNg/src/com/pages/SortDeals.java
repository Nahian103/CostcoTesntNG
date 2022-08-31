package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortDeals {
WebDriver driver;
	
	public  void GreatDeals (WebDriver driver) {
		this.driver = driver;
	}
	
   public void InOrder() {
	
	   driver.findElement(By.id("Home_Ancillary_2")).click();
	   // driver.findElement(By.id("sortByDropDowns")).click();
}

}
