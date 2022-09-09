package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeLocation {
	

		WebDriver driver;
			
			public  NegativeLocation(WebDriver driver) {
				this.driver = driver;
			}
		
			public void  NegativeLocation (String negLocation) {
			

				driver.findElement(By.id("//*[@id=\"navigation-widget\"]/div/nav/div[11]/a")).click();
				driver.findElement(By.id("//*[@id=\"search-warehouse\"]")).sendKeys("negLocation");
				
				
			}



}
