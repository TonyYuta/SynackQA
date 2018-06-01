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
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testNavigateToHoversPage() {
		String expected = "Hovers";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getPageTitle(), expected, "Titel of page Hovers doesn't march to actual");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testGetUser1Name() {
		String expected = "name: user1";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getUser1Name(), expected, "UserName doesn't match to actual Username");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testGetUser2Name() {
		String expected = "name: user2";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getUser2Name(), expected, "UserName doesn't match to actual Username");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testGetUser3Name() {
		String expected = "name: user3";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.getUser3Name(), expected, "UserName doesn't match to actual Username");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testNavigateToUser1Profile() {
		String expected = "https://the-internet.herokuapp.com/users/1";
		homePage.navigateToHoversPage();
		String sctual = "";
		Assert.assertEquals(hoversPage.navigateToUser1Profile(), expected, "User1 profile page doesn't match to actual page");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testNavigateToUser2Profile() {
		String expected = "https://the-internet.herokuapp.com/users/2";
		homePage.navigateToHoversPage();
		String sctual = "";
		Assert.assertEquals(hoversPage.navigateToUser2Profile(), expected, "User2 profile page doesn't match to actual page");
	}
	
	@Test(enabled = true, groups = {"HoversPage",  "bat", "regression", "all"}, priority = 5)
	public void testNavigateToUser3Profile() {
		String expected = "https://the-internet.herokuapp.com/users/3";
		homePage.navigateToHoversPage();
		Assert.assertEquals(hoversPage.navigateToUser3Profile(), expected, "User3 profile page doesn't match to actual page");
	}

	
	
	
	
}
