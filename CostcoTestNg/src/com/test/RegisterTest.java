package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Register;

public class RegisterTest extends Base {
	
	@Test
	public void registerTest() {
		driver.get("https://www.costco.com/");
		Register registerpage = new Register(driver);
		registerpage.register("secretsauce", "!Hotmail101", "!Hotmail101");
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL, "https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/api/CombinedSigninAndSignup/unified?local=signup&csrf_token=QWllK2lhK0pyNkJINkJlL3VZZWRibXhjV0JYSERoZmdTMElJb2Z4UG9sNDV5ejZRVy90dGFLMS82NVcralZxVE5UalhuMnEzaUlSclB1VjhhTU8yK0E9PTsyMDIyLTA4LTI5VDE4OjMwOjQ5LjkzMzE3MjhaOzVZLzhVaElJM1gvUUM2eFZjdHhzdUE9PTt7Ik9yY2hlc3RyYXRpb25TdGVwIjo0fQ==&tx=StateProperties=eyJUSUQiOiI0ZWQ3NDkxMi02ODY4LTQyNzMtYjNjMi1iOGZjZWQ2MDQ1NDYifQ&p=B2C_1A_SSO_WCS_signup_signin_500");}
}