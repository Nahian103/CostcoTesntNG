package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HotelPages;
import com.pages.TravelPages;

public class HotelTest extends Base {

	@Test
	public void TravelTest() throws InterruptedException {
		driver.get("https://www.costco.com/");
		
		TravelPages travelPage = new TravelPages(driver);
		travelPage.Travel();
		Thread.sleep(3000);
		HotelPages hotelpage = new HotelPages(driver);
		hotelpage.Hotel();
		Thread.sleep(3000);

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costcotravel.com/h=4006");
	}
	
}