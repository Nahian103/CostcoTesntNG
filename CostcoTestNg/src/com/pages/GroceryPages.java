package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroceryPages {

	WebDriver driver;

	public GroceryPages(WebDriver driver) {
		this.driver = driver;
		
	}

	public void Grocery() {

		driver.findElement(By.xpath("//div[@id='navigation-widget']//nav[@class='menu']/div[1]/a")).click();
		
	}
	public void Candy() {

		driver.findElement(By.xpath("/html//div[@id='category-scrolllink']//a[@href='/candy.html']//img")).click();
	}
}
