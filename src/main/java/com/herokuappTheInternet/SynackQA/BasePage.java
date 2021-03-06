/**
 *   File Name: BasePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected WebElement we;
	protected WebDriver driver;
	
	// ============================= header =============================
	private By forkMeOnGitHubBtn				= By.cssSelector("body > div:nth-child(2) > a");

	// ============================= footer =============================
	private By poweredByTitle					= By.cssSelector("#content > ul > li:nth-child() > a");
	private By elementalSeleniumLink			= By.cssSelector("#content > ul > li:nth-child() > a");

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String currentPageTitle() {
		return driver.getTitle();
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
