package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.SortDeals;

public class SortDealsTest extends Base {
	
	@Test
	public void Dealstest() {
		driver.get("https://www.costco.com/");
		SortDeals inAday = new SortDeals();
		inAday.InOrder();
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc");
	}

}
