/**
 *   File Name: LoginTest.java<br>
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
 * LoginTest //ADDD (description of class)
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
public class LoginTest extends BaseTest {
	
	// valid credentials
	String username 					= "tomsmith";
	String pwd							= "SuperSecretPassword!";
	
	// invalid credentials
	String invalidUsername				= "tomsmith_";
	String invalidPwd					= "SuperSecretPassword!_";

	
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
		loginPage = new LoginPage(driver);
		securePage = new SecurePage(driver);

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
	
	@Test(enabled = true, groups = {"LoginPage", "SecurePage", "bat", "regression", "all"}, priority = 0)
	public void testLogin() {
		String expected = "You logged into a secure area!\n" + 
				"×";
		homePage.navigateToLoginPage();
	//	Helper.waiting(2000);
		loginPage.login(username, pwd);
	//	Helper.waiting(2000);

		Assert.assertEquals(securePage.loginStatus(), expected, "Login status doesn't match to successfully log in");
	}
	
	@Test(enabled = true, groups = {"LoginPage", "SecurePage", "regression", "all"}, priority = 0)
	public void testInvalidLogin() {
		String expected = "Your username is invalid!\n" + 
				"×";
		homePage.navigateToLoginPage();
	//	Helper.waiting(2000);

		loginPage.login(invalidUsername, invalidPwd);
	//	Helper.waiting(2000);

		Assert.assertEquals(loginPage.loginStatus(), expected, "Login status doesn't match to unsuccessfully log in");
	}
	
}
