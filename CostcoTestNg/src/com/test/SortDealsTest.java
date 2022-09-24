package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Deals;
import com.pages.HomePage;

public class SortDealsTest extends Base {
	
	@Test
	public void Dealstest() throws InterruptedException {
		driver.get("https://www.costco.com/");
		HomePage homepage = new HomePage(driver);
		homepage.goToDealsPage();
		Deals BestDeals = new Deals(driver);
		BestDeals.Sort();
	
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_location_pricing_salePrice+desc");
	}

}
