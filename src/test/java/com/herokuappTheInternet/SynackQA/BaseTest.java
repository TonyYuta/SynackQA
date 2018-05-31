/**
 *   File Name: BaseTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 6, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;

/**
 * BaseTest //ADDD (description of class)
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
public class BaseTest {
	
	WebDriver driver;
	
	HomePage homePage;
	DisappearingElementsPage disappearingElementsPage;
	AboutPage aboutPage;
	ContactUsPage contactUsPage;
	DynamicContentPage dynamicContentPage;
	LoginPage loginPage;
	PortfolioPage portfolioPage;
	GalleryPage galleryPage;
	Helper helper;
	SecurePage securePage;
	
	ArrayList<String> al;
	HashSet<String> hs;
/*	
	@Parameters({ "browser", "appURL", "groups" })
	@BeforeClass(alwaysRun = true)				
	public void initializeClassTestBaseSetup(String browser, String appURL, String groups) {
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
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		//driver.close();
		driver.quit();
		}	
	
*/
	

}