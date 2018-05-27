/**
 *   File Name: HomePageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * HomePageTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HomePageTest extends BaseTest {
	
	@Test(enabled = true, groups = {"Homepage",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateToHomePage() {
		String expected = "";
		homePage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "RegistrationPage",  "regression", "all"}, priority = 0)
	public void testNavigateToDisappearingElementsPage() {
		String expected = "";
		homePage.navigateToDisappearingElementsPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}

	
}
