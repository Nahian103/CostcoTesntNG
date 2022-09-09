package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.NegativeLocation;



public class NegativeLocationTest extends Base {



//patwary12

	@Test
	
	public void LocationTest() {
		
		driver.get("https://www.costco.com/");
		
		NegativeLocation NegativeLocationPage = new NegativeLocation(driver);
		
		 NegativeLocationPage.NegativeLocation("negLocation");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	

	

}
