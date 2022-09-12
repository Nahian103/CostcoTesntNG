package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.TravelPages;

public class TravelTest extends Base {

	@Test
	public void TravelTest() throws InterruptedException {
		driver.get("https://www.costco.com/");
		TravelPages travelPage = new TravelPages(driver);
		travelPage.Travel();
		Thread.sleep(3000);
		

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costcotravel.com/?utm_source=collapse&utm_source=costco.com&utm_medium=referral&utm_campaign=TopNav&utm_term=costcotravel.com&utm_content=20160621");
	}
}
