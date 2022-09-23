package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Category;
import com.pages.Search;

public class CategoryTest extends Base {

	@Test
	public void categorytest() {
		driver.get("https://www.costco.com/");
		Category catergorypage = new Category(driver);
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");}
}