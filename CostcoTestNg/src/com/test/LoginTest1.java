package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LogIn1;

public class LoginTest1 extends Base {
	
//okay 

	@Test
	public void loginTest() {
		driver.get("https://www.costco.com/");
		LogIn1 loginPage = new LogIn1(driver);
		loginPage.login("natenycstandard@gmail.com", "@Nahian103");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=3aVezASsSRqAkAST&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
	}

	
	}

