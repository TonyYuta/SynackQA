/**
 *   File Name: LoginPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 31, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * LoginPage //ADDD (description of class)
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
public class LoginPage extends BasePage {
	
	private static String loginPageUrl = "https://the-internet.herokuapp.com/login";

	// ============================= page =============================	
	private By pageTitle 				= By.cssSelector("#content > .example > h2");
	private By pageInfoText				= By.cssSelector("#content > div > h3");
	private By userNameText				= By.cssSelector("#login > div:nth-child(1) > div > label");
	private By userNameField			= By.cssSelector("#login > div:nth-child(1) > div > input");
	private By userPwdText				= By.cssSelector("#login > div:nth-child(2) > div > label");
	private By userPwdField				= By.cssSelector("#login > div:nth-child(2) > div > input");
	private By loginBtn					= By.cssSelector("#content > div > form > button");
	//private By statusLoginMsg			= By.xpath("//*[@id=\"flash\"]/text()");
	private By statusLoginMsg			= By.cssSelector("#flash:nth-child(1)");
		

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage navigateToLoginPage() {
		driver.navigate().to(loginPageUrl);
		return new LoginPage(driver);
	}
	/*
	public String invalidCredLogin() {
		
		String resultLoginMsg = "";
		
		we = driver.findElement(userNameField);
		we.clear();
		we.sendKeys(invalidUsername);
		
		we = driver.findElement(userPwdField);
		we.clear();
		we.sendKeys(invalidPwd);
		
		we = driver.findElement(loginBtn);
		we.click();
		
		we = driver.findElement(statusLoginMsg);
		resultLoginMsg = we.getText();
		
		return resultLoginMsg;
	} */
/*	
	public SecurePage login() {
		
		we = driver.findElement(userNameField);
		we.clear();
		we.sendKeys(username);
		
		we = driver.findElement(userPwdField);
		we.clear();
		we.sendKeys(pwd);
		
		we = driver.findElement(loginBtn);
		we.click();
		
		return new SecurePage(driver);
	} 
	*/
	public SecurePage login(String username, String pwd) {
		
		we = driver.findElement(userNameField);
		we.clear();
		we.sendKeys(username);
		
		we = driver.findElement(userPwdField);
		we.clear();
		we.sendKeys(pwd);
		
		we = driver.findElement(loginBtn);
		we.click();
		
		return new SecurePage(driver);
	} 

	public String loginStatus() {
		
		String resultLoginMsg = "";
			
		we = driver.findElement(statusLoginMsg);
		resultLoginMsg = we.getText();
			
		return resultLoginMsg;
	} 	
}
