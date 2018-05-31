/**
 *   File Name: DynamicContentPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: May 29, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.Arrays;

/**
 * DynamicContentPageTest //ADDD (description of class)
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
public class DynamicContentPageTest extends BaseTest {

	
	@Parameters({ "browser", "appURL", "groups" })
//	@BeforeClass(alwaysRun = true)	
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
		disappearingElementsPage = new DisappearingElementsPage(driver);
		aboutPage = new AboutPage(driver);
		contactUsPage = new ContactUsPage(driver);
		dynamicContentPage = new DynamicContentPage(driver);
		portfolioPage = new PortfolioPage(driver);
		galleryPage = new GalleryPage(driver);
		helper = new Helper();
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterTestTearDown() {
	//	driver.close();
		driver.quit();
		}			
	
	@Test(enabled = true, groups = {"DynamicContentPageTest",  "bat", "regression", "all"}, priority = 1)
	public void testValueOriginalDynamicContent() {
		homePage.navigateToDynamicContentPage();
		String[] resultOriginalDynamicContent = new String[3];
		Helper.waiting(1000);
		for (int i = 0; i < 3; i++) {
			resultOriginalDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		
		Assert.assertFalse(resultOriginalDynamicContent[0] == "" || resultOriginalDynamicContent[1] == "" || resultOriginalDynamicContent[2] == "" , "One of original Dynamic Content text equals to 0");
	}
	
	@Test(enabled = true, groups = {"DynamicContentPageTest",  "bat", "regression", "all"}, priority = 1)
	public void testValueUpdatedDynamicContent() {
		homePage.navigateToDynamicContentPage();
		String[] resultUpdatedDynamicContent = new String[3];
		//Helper.waiting(1000);
		dynamicContentPage.updateDynamicContent();
		//Helper.waiting(1000);
		for (int i = 0; i < 3; i++) {
			resultUpdatedDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		
		Assert.assertFalse(resultUpdatedDynamicContent[0] == "" || resultUpdatedDynamicContent[1] == "" || resultUpdatedDynamicContent[2] == "" , "One of updated Dynamic Content text equals to 0");
	}
	
	@Test(enabled = true, groups = {"DynamicContentPageTest",  "bat", "regression", "all"}, priority = 1)
	public void testChangingDynamicContent() {
		homePage.navigateToDynamicContentPage();
	//	System.out.println("==================================== debug 01 ===================================");

		Helper.waiting(1000);

		String[] resultOriginalDynamicContent = new String[3];
	//	System.out.println("==================================== debug 02 ===================================");

		for (int i = 0; i < 3; i++) {
			resultOriginalDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		//	System.out.println("==================================== start debug 03 (" + i + ") ===================================");
		//	System.out.println(resultOriginalDynamicContent[i]);
		//	System.out.println("====================================   end debug 03 (" + i + ") ===================================");
		}
		dynamicContentPage.updateDynamicContent();
	//	Helper.waiting(1000);

		String[] resultUpdatedDynamicContent = new String[3];
		for (int i = 0; i < 3; i++) {
			resultUpdatedDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		Assert.assertFalse(Arrays.equals(resultOriginalDynamicContent, resultUpdatedDynamicContent), "Dynamic content doesn't change");
	}
	

	

	
	
	
	
}
