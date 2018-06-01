/**
 *   File Name: HoversPageTest.java<br>
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
 * HoversPageTest //ADDD (description of class)
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
public class HoversPageTest extends BaseTest {
	
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
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	public void afterMethodearDown() {
		driver.quit();
		}		
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToHversPage() {
		String expected = "Hovers";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getUser1Name(), expected, "Titel of page Hovers doesn't march to actual");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 1)
	public void testGetUser1Name() {
		String expected = "User_1";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getUser1Name(), expected, "UserName doesn't match to actual Username");
	}
	

	

	
	
	
	
}
