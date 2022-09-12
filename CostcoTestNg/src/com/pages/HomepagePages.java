package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepagePages {

	WebDriver driver;

	public HomepagePages(WebDriver driver) {
		this.driver = driver;
		
	}

	public void Grocery() {

		driver.findElement(By.xpath("//div[@id='navigation-widget']//nav[@class='menu']/div[1]/a")).click();
		
	}
	public void Candy() {

		driver.findElement(By.xpath("/html//div[@id='category-scrolllink']//a[@href='/candy.html']//img")).click();
	}
	public void Homepage() {

		driver.findElement(By.xpath("/html//header[@id='header-widget']/div[@class='container-fluid fixed-container']/div//div[@class='table-container']/div[@class='table-row']/div[1]/a[@href='/']/img[@alt='Costco US homepage']")).click();
	}
}
