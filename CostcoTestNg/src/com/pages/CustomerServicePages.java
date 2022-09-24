package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerServicePages {

	WebDriver driver;

	public CustomerServicePages(WebDriver driver) {
		this.driver = driver;
		
	}

	public void CustomerService() {

		driver.findElement(By.id("customer-service-link")).click();
		
	}
	public void ContactUs() {

		driver.findElement(By.id("desktopDropdownMenuButton")).click();
	}
	
	public void CallUs() {

		driver.findElement(By.className("\"dropdown-item contactus-item\"")).click();
	}
}
