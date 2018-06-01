/**
 *   File Name: SecurePage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 31, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {
	
	private static String secureAreaPageUrl = "https://the-internet.herokuapp.com/secure";

	// ============================= page =============================	
	private By statusLoginMsg			= By.cssSelector("#flash:nth-child(1)");
	private By pageTitle 				= By.cssSelector("#content > .example > h2");
	private By pageInfoText				= By.cssSelector("#content > div > h2");
	private By logoutBtn				= By.cssSelector("#content > div > a");
	
	public SecurePage(WebDriver driver) {
		super(driver);
	}

	public LoginPage logout() {
		we = driver.findElement(logoutBtn);
		we.click();
		return new LoginPage(driver);
	} 

	public String loginStatus() {
			
		String resultLoginMsg = "";
			
		we = driver.findElement(statusLoginMsg);
		resultLoginMsg = we.getText();
			
		return resultLoginMsg;
	} 
	
	
}
