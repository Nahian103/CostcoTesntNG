package com.test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AddToCart;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AddToCartTest extends Base  {
	

	@Test
	public void AddToCartTests() {
		driver.get("https://www.costco.com/.product.100829085.html?ADBUTLERID=homepage_item_driver_cannonsafe");
		AddToCart oneItem = new AddToCart(driver);
		oneItem.ItemToCart();
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/.product.100829085.html?ADBUTLERID=homepage_item_driver_cannonsafe");
	}

}
