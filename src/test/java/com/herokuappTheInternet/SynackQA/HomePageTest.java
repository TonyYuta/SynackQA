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

/**
 * HomePageTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HomePageTest extends BaseTest {
	
	@Parameters({ "browser", "appURL", "groups" })
	@BeforeMethod(alwaysRun = true)				
	//public void initializeClassTestBaseSetup(String browser, String appURL, String groups) {
	public void initializeTestBaseSetup(String browser, String appURL, String groups) {
		try {
			DriverFactory.setDriver(browser, appURL, groups);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		driver = DriverFactory.getDriver();
		
		homePage = new HomePage(driver);
	//	disappearingElementsPage = new DisappearingElementsPage(driver);
	//	aboutPage = new AboutPage(driver);
	//	contactUsPage = new ContactUsPage(driver);
	//	dynamicContentPage = new DynamicContentPage(driver);
	//	portfolioPage = new PortfolioPage(driver);
	//	galleryPage = new GalleryPage(driver);
		helper = new Helper();
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	//public void afterClassTearDown() {
	public void afterMethodearDown() {
	//	driver.close();
		driver.quit();
		}		
	
	

	
	@Test(enabled = true, groups = {"HomePage",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateToHomePage() {
		String expected = "The Internet";
		homePage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"HomePage", "RegistrationPage",  "regression", "all"}, priority = 0)
	public void testNavigateToDisappearingElementsPage() {
		String expected = "The Internet";
		homePage.navigateToDisappearingElementsPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}

	
}
