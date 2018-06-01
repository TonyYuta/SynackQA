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
import org.openqa.selenium.interactions.Actions;

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
	private By user2Name				= By.cssSelector("#content > div > div:nth-child(4) > div > h5"); 	
	private By user3Name				= By.cssSelector("#content > div > div:nth-child(5) > div > h5"); 	
	
	private By viewProfileUser1Link		= By.cssSelector("#content > div > div:nth-child(3) > div > a"); 	
	private By viewProfileUser2Link		= By.cssSelector("#content > div > div:nth-child(4) > div > a"); 	
	private By viewProfileUser3Link		= By.cssSelector("#content > div > div:nth-child(5) > div > a"); 	
	
	HoversPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}

	public String getUser1Name() {		
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser1);
		actions.moveToElement(avatar);

		WebElement userName = driver.findElement(user1Name);
		actions.moveToElement(userName);
		actions.build().perform();
		
		return userName.getText();
	}
	
	public String getUser2Name() {
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser2);
		actions.moveToElement(avatar);

		WebElement userName = driver.findElement(user2Name);
		actions.moveToElement(userName);
		actions.build().perform();
		
		return userName.getText();
	}
	
	public String getUser3Name() {	
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser3);
		actions.moveToElement(avatar);

		WebElement userName = driver.findElement(user3Name);
		actions.moveToElement(userName);
		actions.build().perform();
		
		return userName.getText();
	}
	
	public String navigateToUser1Profile() {		
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser1);
		actions.moveToElement(avatar);

		WebElement viewProfileLink = driver.findElement(viewProfileUser1Link);
		actions.moveToElement(viewProfileLink);
		actions.click().build().perform();
		Helper.waiting(2000);
		return driver.getCurrentUrl();
	}
	
	public String navigateToUser2Profile() {	
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser2);
		actions.moveToElement(avatar);

		WebElement viewProfileLink = driver.findElement(viewProfileUser2Link);
		actions.moveToElement(viewProfileLink);
		actions.click().build().perform();
		Helper.waiting(2000);
		return driver.getCurrentUrl();
	}
	
	public String navigateToUser3Profile() {
		Actions actions = new Actions(driver);
		WebElement avatar = driver.findElement(avatarUser3);
		actions.moveToElement(avatar);

		WebElement viewProfileLink = driver.findElement(viewProfileUser3Link);
		actions.moveToElement(viewProfileLink);
		actions.click().build().perform();
		Helper.waiting(2000);
		return driver.getCurrentUrl();
	}
	
	
}
