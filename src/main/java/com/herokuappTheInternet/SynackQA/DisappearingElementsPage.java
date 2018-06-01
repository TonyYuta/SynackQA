/**
 *   File Name: DisappearingElementsPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 26, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsPage extends BasePage {
	
	// ============================= page =============================	
	// titles / text
	private By pageTitle		= By.cssSelector("#content > div > h3");
	private By pageInfoText		= By.cssSelector("#content > div > p");
	private By homeBtn 			= By.cssSelector("#content > div > ul > li:nth-child(1) > a");
	private By aboutBtn 		= By.cssSelector("#content > div > ul > li:nth-child(2) > a");
	private By contactUsBtn 	= By.cssSelector("#content > div > ul > li:nth-child(3) > a");
	private By portfolioBtn 	= By.cssSelector("#content > div > ul > li:nth-child(4) > a");
	private By galleryBtn 		= By.cssSelector("#content > div > ul > li:nth-child(5) > a");		
	
	DisappearingElementsPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage navigateToHomePage() {
		we = driver.findElement(homeBtn);
		we.click();
		return new HomePage(driver);
	}
	
	public AboutPage navigateToAboutPage() {
		we = driver.findElement(aboutBtn);
		we.click();
		return new AboutPage(driver);
	}
	
	public ContactUsPage navigateToContactUstPage() {
		we = driver.findElement(contactUsBtn);
		we.click();
		return new ContactUsPage(driver);
	}
	
	public PortfolioPage navigateToPortfolioPage() {
		we = driver.findElement(portfolioBtn);
		we.click();
		return new PortfolioPage(driver);
	}
	
	public GalleryPage navigateToGalleryPage() {
		we = driver.findElement(galleryBtn);
		we.click();
		return new GalleryPage(driver);
	}
	
	
}
