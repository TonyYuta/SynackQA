/**
 *   File Name: NotificationMessagesPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 27, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesPage extends BasePage {
	
	// ============================= page =============================	
	private By pageTitle				= By.cssSelector("#content > div > h3");
	private By pageInfoText				= By.cssSelector("#content > div > p");
	private By clickHereBtn				= By.cssSelector("#content > div > p > a");
	private By actionStatusText			= By.cssSelector("#flash:nth-child(1)");
	
	NotificationMessagesPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}

	public String getNotification() {		
		we = driver.findElement(actionStatusText);
		return we.getText();
	}
	
	public void updateNotification() {		
		we = driver.findElement(clickHereBtn);
		we.click();
	}
	
	
	
}
