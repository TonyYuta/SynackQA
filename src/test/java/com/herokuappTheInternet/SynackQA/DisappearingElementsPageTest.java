/**
 *   File Name: DisappearingElementsPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DisappearingElementsPageTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class DisappearingElementsPageTest extends BaseTest {
	
	@Test(enabled = true, groups = {"DisappearingElementsPageTest",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateToHomePage() {
		String expected = "The Internet";
		disappearingElementsPage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "Welcome message doesn't match to Home page");
	}

	
	
	
	
}
