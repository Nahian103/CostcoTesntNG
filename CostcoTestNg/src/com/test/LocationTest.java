package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Location;



public class LocationTest extends Base {

//patwary12

	@Test
	
	public void LocationTest() {
		
		driver.get("https://www.costco.com/");
		
		Location locationTestPage = new Location(driver);
		
		locationTestPage.Location("findRightLocation");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	

}
