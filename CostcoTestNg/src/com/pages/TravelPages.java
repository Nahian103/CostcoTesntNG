package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelPages {

	WebDriver driver;

	public TravelPages(WebDriver driver) {
		this.driver = driver;
	}

	public void Travel() {

		driver.findElement(By.xpath("//div[@id='navigation-widget']//nav[@class='menu']/div[9]/a")).click();

	}

}
