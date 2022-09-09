package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Deals;
import com.pages.SameDay;

public class SameDayTest extends Base{
	@Test
	public void Dealstest() {
		driver.get("https://www.costco.com/");
		SameDay Rightway = new SameDay(driver);
		Rightway.Instant();
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://sameday.costco.com/?utm_source=nav&zipcode=11377");
	}

}
