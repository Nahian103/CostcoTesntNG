package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Deals {

WebDriver driver;
	
	public Deals(WebDriver driver) {
		this.driver = driver;
	}
	
   public void GreatDeals() {
	   
	
	   driver.findElement(By.id("Home_Ancillary_2")).click();
	  
   }
 
   public void Sort() {
	  
	   
	   Select dropdown = new Select(driver.findElement(By.id("sort_by")));
	  dropdown.selectByVisibleText("Price (High to Low)");
	  
	   //push one more tim
	  // push 
   }
   
}