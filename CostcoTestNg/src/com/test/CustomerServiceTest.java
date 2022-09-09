package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.CustomerService;


public class CustomerServiceTest extends Base {
	

	
//patwary12

	@Test
	
	public void CustomerServiceTest() {
		
		driver.get("https://www.costco.com/");
		
		CustomerService CustomerServicePage = new CustomerService(driver);
		CustomerServicePage.CustomerService("myOrders");
		
		
		
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	
	



}
