package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Location {

		WebDriver driver;
			
			public Location(WebDriver driver) {
				this.driver = driver;
			}
		
			public void Location (String findRightLocation) {
			

				driver.findElement(By.id("//*[@id=\"navigation-widget\"]/div/nav/div[11]/a")).click();
				driver.findElement(By.id("//*[@id=\"search-warehouse\"]")).sendKeys("findRightLocation");
				
				
			}


}
