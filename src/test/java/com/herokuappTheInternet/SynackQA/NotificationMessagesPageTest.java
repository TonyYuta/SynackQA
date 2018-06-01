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

/**
 * NotificationMessagesPageTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
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
		String expected1 = "\n" + 
				"            Action unsuccesful, please try again\n" + 
				"            ";
		String expected2 = "            Action successful";

		homePage.navigateToNotificationMessagesPage();
		Assert.assertTrue((notificationMessagesPage.getNotification().equals(expected1) || notificationMessagesPage.getNotification().equals(expected2)), "There is no any expected notifications");
	}
	
	
	

	
	
}
