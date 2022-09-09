package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LogIn;
import com.pages.Services;

public class ServicesTest extends Base {
	
	
	@Test
	
	public void ServicesTest() {
		
		driver.get("https://www.costco.com/");
		Services servicespage = new Services(driver);
		
		
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	
	}



