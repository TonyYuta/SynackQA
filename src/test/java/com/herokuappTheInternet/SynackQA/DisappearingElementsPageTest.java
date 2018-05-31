/**
 *   File Name: DisappearingElementsPageTest.java<br>
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
 * DisappearingElementsPageTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class DisappearingElementsPageTest extends BaseTest {
	
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
		disappearingElementsPage = new DisappearingElementsPage(driver);
		aboutPage = new AboutPage(driver);
		contactUsPage = new ContactUsPage(driver);
		dynamicContentPage = new DynamicContentPage(driver);
		portfolioPage = new PortfolioPage(driver);
		galleryPage = new GalleryPage(driver);
		helper = new Helper();
	}
	
	@AfterMethod(enabled = true, alwaysRun = true)
	//public void afterClassTearDown() {
	public void afterMethodearDown() {
	//	driver.close();
		driver.quit();
		}		
	
	@Test(enabled = true, groups = {"DisappearingElementsPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToHomePage() {
		String expected = "The Internet";
		homePage.navigateToDisappearingElementsPage();
		disappearingElementsPage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "Welcome message doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"DisappearingElementsPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToAboutPage() {
		String expected = "https://the-internet.herokuapp.com/about/";
		homePage.navigateToDisappearingElementsPage();
		disappearingElementsPage.navigateToAboutPage();
		Assert.assertEquals(aboutPage.currentUrl(), expected, "Welcome message doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"DisappearingElementsPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToContactUsPage() {
		String expected = "https://the-internet.herokuapp.com/contact-us/";
		homePage.navigateToDisappearingElementsPage();
		disappearingElementsPage.navigateToContactUstPage();
		Assert.assertEquals(aboutPage.currentUrl(), expected, "Welcome message doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"DisappearingElementsPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToPortfolioPage() {
		String expected = "https://the-internet.herokuapp.com/portfolio/";
		homePage.navigateToDisappearingElementsPage();
		disappearingElementsPage.navigateToPortfolioPage();
		Assert.assertEquals(portfolioPage.currentUrl(), expected, "Welcome message doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"DisappearingElementsPage",  "bat", "regression", "all"}, priority = 1)
	public void testNavigateToGalleryPage() {
		String expected = "https://the-internet.herokuapp.com/gallery/";
		homePage.navigateToDisappearingElementsPage();
		disappearingElementsPage.navigateToGalleryPage();
		Assert.assertEquals(galleryPage.currentPageTitle(), expected, "Welcome message doesn't match to Home page");
	}
	

	
	
	
	
}
