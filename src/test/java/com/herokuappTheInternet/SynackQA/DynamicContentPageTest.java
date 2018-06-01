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

public class DynamicContentPageTest extends BaseTest {

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
		dynamicContentPage = new DynamicContentPage(driver);
		helper = new Helper();
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterTestTearDown() {
		driver.quit();
		}			
	
	@Test(enabled = true, groups = {"DynamicContentPage",  "bat", "regression", "all"}, priority = 2)
	public void testValueOriginalDynamicContent() {
		homePage.navigateToDynamicContentPage();
		String[] resultOriginalDynamicContent = new String[3];
		for (int i = 0; i < 3; i++) {
			resultOriginalDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		
		Assert.assertFalse(resultOriginalDynamicContent[0] == "" || resultOriginalDynamicContent[1] == "" || resultOriginalDynamicContent[2] == "" , "One of original Dynamic Content text equals to 0");
	}
	
	@Test(enabled = true, groups = {"DynamicContentPage",  "bat", "regression", "all"}, priority = 2)
	public void testValueUpdatedDynamicContent() {
		homePage.navigateToDynamicContentPage();
		String[] resultUpdatedDynamicContent = new String[3];
		dynamicContentPage.updateDynamicContent();
		for (int i = 0; i < 3; i++) {
			resultUpdatedDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}	
		Assert.assertFalse(resultUpdatedDynamicContent[0] == "" || resultUpdatedDynamicContent[1] == "" || resultUpdatedDynamicContent[2] == "" , "One of updated Dynamic Content text equals to 0");
	}
	
	@Test(enabled = true, groups = {"DynamicContentPage",  "bat", "regression", "all"}, priority = 2)
	public void testChangingDynamicContent() {
		homePage.navigateToDynamicContentPage();

		String[] resultOriginalDynamicContent = new String[3];

		for (int i = 0; i < 3; i++) {
			resultOriginalDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		dynamicContentPage.updateDynamicContent();

		String[] resultUpdatedDynamicContent = new String[3];
		for (int i = 0; i < 3; i++) {
			resultUpdatedDynamicContent[i] = dynamicContentPage.captureDynamicContent()[i];
		}
		Assert.assertFalse(Arrays.equals(resultOriginalDynamicContent, resultUpdatedDynamicContent), "Dynamic content doesn't change");
	}
	

	

	
	
	
	
}
