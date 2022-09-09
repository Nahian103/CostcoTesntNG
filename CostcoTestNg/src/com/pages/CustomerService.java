package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerService {
	



WebDriver driver;
	
	public CustomerService (WebDriver driver) {
		this.driver = driver;
	}
	



	public void CustomerService ( String myOrders) {
	

		driver.findElement(By.id("//*[@id=\"customer-service-link\"]")).click();
		driver.findElement(By.id("//*[@id=\"rn_SourceSearchField_5_SearchInput\"]")).sendKeys(myOrders);
		driver.findElement(By.id("//*[@id=\"leftNavWrapper\"]/a[1]/div/p")).sendKeys();
		
	}

	


}
