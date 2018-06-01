/**
 *   File Name: LoginTest.java<br>
 *
 *   Yutaka<br>
 *   Created: May 31, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	// valid credentials
	String username 					= "tomsmith";
	String pwd							= "SuperSecretPassword!";
	
	// invalid credentials
	String invalidUsername				= "tomsmith_";
	String invalidPwd					= "SuperSecretPassword!_";

	
	@Parameters({ "browser", "appURL", "groups" })
	@BeforeMethod(alwaysRun = true)				
	public void initializeTestBaseSetup(String browser, String appURL, String groups) {
		try {
			DriverFactory.setDriver(browser, appURL, groups);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		driver = DriverFactory.getDriver();
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		securePage = new SecurePage(driver);
		helper = new Helper();
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	public void afterMethodearDown() {
		driver.quit();
		}		
	
	@Test(enabled = true, groups = {"LoginPage", "SecurePage", "bat", "regression", "all"}, priority = 0)
	public void testLogin() {
		String expected = "You logged into a secure area!\n" + 
				"×";
		homePage.navigateToLoginPage();
		loginPage.login(username, pwd);

		Assert.assertEquals(securePage.loginStatus(), expected, "Login status doesn't match to successfully log in");
	}
	
	@Test(enabled = true, groups = {"LoginPage", "SecurePage", "regression", "all"}, priority = 0)
	public void testInvalidLogin() {
		String expected = "Your username is invalid!\n" + 
				"×";
		homePage.navigateToLoginPage();

		loginPage.login(invalidUsername, invalidPwd);

		Assert.assertEquals(loginPage.loginStatus(), expected, "Login status doesn't match to unsuccessfully log in");
	}
	
}
