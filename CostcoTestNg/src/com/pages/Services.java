package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Services {
	

		WebDriver driver;
			
			public Services(WebDriver driver) {
				this.driver = driver;
			}


			public void Services() {
			

				driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_6\"]")).click();
				
				;
			}

			}


