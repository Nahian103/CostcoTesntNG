package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailOffer {
	

		WebDriver driver;
			
			public EmailOffer  (WebDriver driver) {
				this.driver = driver;
			}
			

			public void EmailOffer(String emailAddress) {
			

				driver.findElement(By.id("//*[@id=\"email-signup-link\"]")).click();
				driver.findElement(By.id("//*[@id=\"email\"]")).sendKeys("emailAddress");
				
				
			}

			

}
