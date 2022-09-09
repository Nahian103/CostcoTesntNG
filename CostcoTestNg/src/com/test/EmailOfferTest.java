package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.pages.EmailOffer;

public class EmailOfferTest extends Base {


	

	
//patwary11

	@Test
	
	public void EmailOfferTest() {
		
		driver.get("https://www.costco.com/");
		
		EmailOffer EmailOfferPage = new EmailOffer(driver);
		
		EmailOfferPage.EmailOffer("emailAddress");
		
		
		
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://www.costco.com/");
	}

	

}
