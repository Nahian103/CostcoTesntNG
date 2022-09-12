package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.CustomerServicePages;


public class CustomerServiceTest extends Base {

	@Test
	public void CustomerServiceTest() throws InterruptedException {
		driver.get("https://www.costco.com/");
		
		CustomerServicePages customerservice = new CustomerServicePages(driver);
		customerservice.CustomerService();
		Thread.sleep(3000);
		
		CustomerServicePages contactus = new CustomerServicePages(driver);
		contactus.ContactUs();
		Thread.sleep(3000);
		
//		String currentUrl = "https://customerservice.costco.com/";
//		if (currentUrl == "https://customerservice.costco.com/") {
//			WebElement sortDropDown = driver.findElement(By.className("dropdown-item contactus-item"));
//			

//			Select selectSortDropDown = new Select(sortDropDown);
//			selectSortDropDown.selectByIndex(2);

//			Thread.sleep(3000);
//			sortDropDown = driver.findElement(By.className("product_sort_container"));
		
		CustomerServicePages callus = new CustomerServicePages(driver);
		callus.CallUs();
		Thread.sleep(3000);

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/candy.html");
	}
	}
	
