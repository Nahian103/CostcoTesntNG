package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AddToCart;


public class AddToCartTest extends Base {
	
	@Test
	public void AddToCartTests() {
		driver.get("https://www.costco.com/");
		AddToCart oneItem = new AddToCart(driver);
		oneItem.ItemToCart();
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

}
