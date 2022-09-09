package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.GroceryPages;
import com.pages.HomepagePages;



public class HomepageTest extends Base {

	@Test
	public void HomepageTest() throws InterruptedException {
		driver.get("https://www.costco.com/");
		
		GroceryPages groceryPage = new GroceryPages(driver);
		groceryPage.Grocery();
		Thread.sleep(3000);
		GroceryPages Candy = new GroceryPages(driver);
		Candy.Candy();
		Thread.sleep(3000);
		HomepagePages homepage = new HomepagePages(driver);
		homepage.Homepage();
		Thread.sleep(3000);

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}
	
}