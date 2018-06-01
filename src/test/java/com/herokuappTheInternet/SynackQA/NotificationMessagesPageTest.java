/**
 *   File Name: NotificationMessagesPageTest.java<br>
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

public class NotificationMessagesPageTest extends BaseTest {
	
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
		hoversPage = new HoversPage(driver);
		helper = new Helper();
		notificationMessagesPage = new NotificationMessagesPage(driver);
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	public void afterMethodearDown() {
		driver.quit();
		}		
	
	@Test(enabled = true, groups = {"NotificationMessagesPage",  "bat", "regression", "all"}, priority = 7)
	public void testGetNotification() {
		String expected1 = "Action unsuccesful, please try again\n" + 
				"×";
		String expected2 = "Action successful\n" + 
				"×";

		homePage.navigateToNotificationMessagesPage();
		Assert.assertTrue((notificationMessagesPage.getNotification().equals(expected1) || notificationMessagesPage.getNotification().equals(expected2)), "There is no any expected notifications");
	}
	
	@Test(enabled = true, groups = {"NotificationMessagesPage", "regression", "all"}, priority = 7)
	public void testForceToGetSuccessNotification() {
		boolean expected = false;
		String expected1 = "Action unsuccesful, please try again\n" + 
				"×";
		String expected2 = "Action successful\n" + 
				"×";
		homePage.navigateToNotificationMessagesPage();
		
		for (int i = 0; i < 10; i++) {
			if(notificationMessagesPage.getNotification().equals(expected1)) {
				expected = false;
				notificationMessagesPage.updateNotification();
				Helper.waiting(1000);
			} else if(notificationMessagesPage.getNotification().equals(expected2)) {
				expected = true;
				System.out.println("============== debug ============= i: " + i);
				break;
			}
		}
		Assert.assertTrue(expected, "There is no successfull notification after click the btn 10 times");
	}
	
	
	

	
	
}
