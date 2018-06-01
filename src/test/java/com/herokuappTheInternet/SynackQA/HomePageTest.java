/**
 *   File Name: HomePageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
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
		helper = new Helper();
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	public void afterMethodearDown() {
		driver.quit();
		}			
	
	@Test(enabled = true, groups = {"HomePage",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateToHomePage() {
		String expected = "The Internet";
		homePage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "Title doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"HomePage", "RegistrationPage",  "regression", "all"}, priority = 0)
	public void testNavigateToDisappearingElementsPage() {
		String expected = "The Internet";
		homePage.navigateToDisappearingElementsPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "Title doesn't match to Home page");
	}

	@Test(enabled = true, groups = {"HomePage", "regression", "all"}, priority = 0)
	public void testNavigateToHoversPage() {
		String expected = "Hovers";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getPageTitle(), expected, "Title of page Hovers doesn't march to actual");
	}
	
	@Test(enabled = true, groups = {"HomePage", "regression", "all"}, priority = 0)
	public void testNavigateToNotificationMessagesPage() {
		String expected = "Notification Message";
		homePage.navigateToNotificationMessagesPage();
		Assert.assertEquals(notificationMessagesPage.getPageTitle(), expected, "Title of page NotificationMessagesPage doesn't march to actual");
	}
	
	@Test(enabled = true, groups = {"HomePage", "regression", "all"}, priority = 0)
	public void testNavigateToLoginPage() {
		String expected = "Login Page";
		homePage.navigateToLoginPage();
		Assert.assertEquals(loginPage.currentPageTitle(), expected, "Title of Login Page doesn't march to actual");
	}
	
}
