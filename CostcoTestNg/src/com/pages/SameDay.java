package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SameDay {
WebDriver driver;
	
	public SameDay(WebDriver driver) {
		this.driver = driver;
	}
	
   public void Instant() {
	
	   driver.findElement(By.id("Home_Ancillary_1")).click();;
}

}
