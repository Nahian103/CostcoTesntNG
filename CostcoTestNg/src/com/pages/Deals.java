package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Deals {

	WebDriver driver;

	public Deals(WebDriver driver) {
		this.driver = driver;
	}

	public void GreatDeals() {

		driver.findElement(By.id("Home_Ancillary_2")).click();

	}

	public void Sort() {

		Set<String> Windowhandles = driver.getWindowHandles();
	    Iterator<String> iterator = Windowhandles.iterator();
	    String firstPage = iterator.next();
	    String secondPage = iterator.next();
	    
	    driver.switchTo().window(secondPage);
		
		Select dropdown = new Select(driver.findElement(By.id("sort_by")));
		dropdown.selectByValue("item_location_pricing_salePrice desc");

		
	}

}

