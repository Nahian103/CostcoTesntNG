package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Search;

public class SearchTest extends Base {

	@Test
	public void searchtest() {
		driver.get("https://www.costco.com/");
		Search searchpage = new Search(driver);
		searchpage.search("Candy");
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/CatalogSearch?dept=All&keyword=Candy");
		}

	}

//Mahir