package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Deals;
import com.pages.HomePage;

public class SortDealsTest extends Base {
	
	@Test
	public void Dealstest() {
		driver.get("https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc");
		HomePage homepage = new HomePage(driver);
		homepage.goToDealsPage();
		Deals BestDeals = new Deals(driver);
		BestDeals.Sort();
	

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc");
	}

}
