package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPages {

	WebDriver driver;

	public HotelPages(WebDriver driver) {
		this.driver = driver;
		
	}

	public void Travel() {

		driver.findElement(By.xpath("//div[@id='navigation-widget']//nav[@class='menu']/div[9]/a")).click();
		
	}
	public void Hotel() {

		driver.findElement(By.xpath("/html//a[@id='hotels-tab-id']")).click();
	}

}
