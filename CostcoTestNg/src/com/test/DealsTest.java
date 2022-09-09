package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Deals;

public class DealsTest extends Base{
	
	@Test
	public void Dealstest() {
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		Deals BestDeals = new Deals(driver);
		BestDeals.GreatDeals();
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc");
	}
	}
