/**
 *   File Name: HoversPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 27, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * HoversPage //ADDD (description of class)
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
public class HoversPage extends BasePage {
	
	// ============================= page =============================	
	// titles / text
	private By pageTitle				= By.cssSelector("#content > div > h3");
	private By pageInfoText				= By.cssSelector("#content > div > p");
	private By clickHereLink			= By.cssSelector("#content > div > p:nth-child(3) > a");
	private By avatarUser1				= By.cssSelector("#content > div > div:nth-child(3) > img");
	private By avatarUser2				= By.cssSelector("#content > div > div:nth-child(4) > img");
	private By avatarUser3				= By.cssSelector("#content > div > div:nth-child(5) > img");
	private By user1Name				= By.cssSelector("#content > div > div:nth-child(3) > div > h5"); 	
	private By user2Name				= By.cssSelector("#content > div > div:nth-child(3) > div > h5"); 	
	private By user3Name				= By.cssSelector("#content > div > div:nth-child(3) > div > h5"); 	
	
	HoversPage(WebDriver driver) {
		super(driver);
	}
	
	public String getUser1Name() {
		
		String userName = "";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf((WebElement) avatarUser1));
		wait.until(ExpectedConditions.visibilityOf((WebElement) user1Name));
		userName = driver.findElement(user1Name).getText();
		return userName;
		/*
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector_For_Element_To_Be_Click_After_Hover)));
		driver.findElement(By.cssSelector(selector_For_Element_To_Be_Click_After_Hover)).click();
*/
	/*	Actions action = new Actions(driver);
		we = driver.findElement(avatarUser1);
		action.moveToElement(we).moveToElement(driver.findElement(user1Name).getText().build().perform();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector_For_Element_To_Be_Click_After_Hover)));
		driver.findElement(By.cssSelector(selector_For_Element_To_Be_Click_After_Hover)).click();
*/
		
	}

	
	
	
	
}
