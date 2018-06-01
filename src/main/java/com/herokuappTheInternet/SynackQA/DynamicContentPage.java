/**
 *   File Name: DynamicContentPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 27, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicContentPage extends BasePage {
	
	// ============================= page =============================	
	// titles / text
	private By pageTitle				= By.cssSelector("#content > div > h3");
	private By pageInfoText				= By.cssSelector("#content > div > p");
	private By dinamicContentInfoText	= By.cssSelector("#content > div > p:nth-child(2)");
	private By clickHereLink			= By.cssSelector("#content > div > p:nth-child(3) > a");
	private By text1					= By.cssSelector("#content > div:nth-child(1) > div.large-10.columns"); 	
	private By text2					= By.cssSelector("#content > div:nth-child(4) > div.large-10.columns"); 	
	private By text3					= By.cssSelector("#content > div:nth-child(7) > div.large-10.columns"); 	
	
	// dynamic content text result  
	private String[] text = new String[3];
	
	DynamicContentPage(WebDriver driver) {
		super(driver);
	}
	
	public void updateDynamicContent() {
		we = driver.findElement(clickHereLink);
		we.click();
	}
	
	public String[] captureDynamicContent() {
		text[0] = driver.findElement(text1).getText();
		text[1] = driver.findElement(text2).getText();
		text[2] = driver.findElement(text3).getText();	
		return text;
	}
	
	
	
	
}
