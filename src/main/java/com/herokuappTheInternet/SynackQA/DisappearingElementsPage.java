/**
 *   File Name: DisappearingElementsPage.java<br>
 *
 *   Yutaka<br>
 *   Created: May 26, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * DisappearingElementsPage //ADDD (description of class)
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
public class DisappearingElementsPage extends BasePage {
	
	
	private By fNameField = By.id("name_3_firstname");
	private By lNameField = By.id("name_3_lastname");
	private By marStatusSingleRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(2)"); 
	private By marStatusMarriedRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(4)"); 
	private By marStatusDivorcedRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(6)"); 
	
	private By hobbyDanceCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(2)");
	private By hobbyReadingCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(4)");
	private By hobbyCricketCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(6)");	
	private By phoneField =  By.id("phone_9");
	private By usernameField = By.id("username");
	private By emailField = By.id("email_1");
	private By profilePictureBtn = By.id("profile_pic_10");
	private By aboutYourselfField = By.id("description");
	private By pwdField = By.id("password_2");
	private By confirmPwdField = By.id("confirm_password_password_2");
	private By submitBtn = By.cssSelector("#pie_register > li:nth-child(14) > div > input[type=\"submit\"]");	
	private By confirmRegistrationMsg = By.cssSelector(".piereg_message");
			
	
	DisappearingElementsPage(WebDriver driver) {
		super(driver);
	}
	
	public String registrationUser(
			String fName,
			String lName,
			String marStatus,
			boolean hobbyDance,
			boolean hobbyReading,
			boolean hobbyCricket,
			String country,
			int dobMonth,
			int dobDay,
			int dobYear,
			String phone,
			String userName,
			String email,
			String profilePicture,
			String aboutYourself,
			String pwd) {
		
		String registrutionStatus = "";
		
		// fill out first name
		we = driver.findElement(fNameField);
		we.click();
		we.clear();
		we.sendKeys(fName);
		
	//	Helper.waiting1000();
		
		// fill out last name
		we = driver.findElement(lNameField);
		we.click();
		we.clear();
		we.sendKeys(lName);

	//	Helper.waiting1000();

		// choose marital status
		
		char[] marStatusArray = marStatus.toLowerCase().toCharArray();
		char marStatusChar = marStatusArray[0];
		
		switch(marStatusChar) {
			case 's' : {
				// choose Single Radio Button
				we = driver.findElement(marStatusSingleRadioBtn);
				we.click();
				}
			break;

			case 'm' : {
				// choose Married Radio Button
				we = driver.findElement(marStatusMarriedRadioBtn);
				we.click();
				}
			break;
			
			case 'd' : {
				// choose Divorced Radio Button
				we = driver.findElement(marStatusDivorcedRadioBtn);
				we.click();
				}
			break;
		}
		
//		Helper.waiting1000();
	
		// choose Hobby check boxes
		
		if(hobbyDance) {
			we = driver.findElement(hobbyDanceCheckBox);
			we.click();
		}
				
		if(hobbyReading) {
			we = driver.findElement(hobbyReadingCheckBox);
			we.click();
		}
		
		if(hobbyCricket) {
			we = driver.findElement(hobbyCricketCheckBox);
			we.click();
		}
		
	//	Helper.waiting(1000);

		// choose country
		int countryDropDownNumber = Helper.countryNameToDropDownNumber(country);;
		String countryDropDownListString = "#dropdown_7 > option:nth-child(" + countryDropDownNumber + ")";
		By countryDropDownList = By.cssSelector(countryDropDownListString);		
		we = driver.findElement(countryDropDownList);
		we.click();
				
	//	Helper.waiting(1000);
		
		// choose month DOB
		String dobMonthDropDownListString = "#mm_date_8 > option:nth-child(" + (dobMonth + 1) + ")";
		By dobMonthDropDownList = By.cssSelector(dobMonthDropDownListString);
		we = driver.findElement(dobMonthDropDownList);
		we.click();
	//	Helper.waiting(2000);

		// choose day DOB
		String dobDayDropDownListString = "#dd_date_8 > option:nth-child(" + (dobDay + 1) + ")";
		By dobDayDropDownList = By.cssSelector(dobDayDropDownListString);
		we = driver.findElement(dobDayDropDownList);
		we.click();
	//	Helper.waiting(2000);
		
		// choose year DOB
		int yearNumberDropDown = Helper.yearToDropDownNumber(dobYear);
		String dobYearDropDownListString = "#yy_date_8 > option:nth-child(" + (yearNumberDropDown) + ")";
		By dobYearDropDownList = By.cssSelector(dobYearDropDownListString);
		we = driver.findElement(dobYearDropDownList);
		we.click();		
		
		Helper.waiting(1000);
		
		// provide phone number
		we = driver.findElement(phoneField);
		we.clear();
		we.sendKeys(phone);
		Helper.waiting(1000);

		// provide User Name
		we = driver.findElement(usernameField);
		we.clear();
		//we.sendKeys(userName);
		we.sendKeys(Helper.generateUserName()); // randomly generated
		Helper.waiting(1000);
	
		// provide email
		we = driver.findElement(emailField);
		we.clear();
		//we.sendKeys(email);
		we.sendKeys(Helper.generateEmail()); // randomly generated
		Helper.waiting(1000);

		// provide link for avatar
		//we = driver.findElement(profilePictureBtn);
		//we.click();
		//Helper.waiting(1000);

		// provide info About Yourself
		we = driver.findElement(aboutYourselfField);
		we.clear();
		we.sendKeys(aboutYourself);
		Helper.waiting(1000);
		
		// provide pwd
		we = driver.findElement(pwdField);
		we.clear();
		we.sendKeys(pwd);
		Helper.waiting(1000);
		
		// confirm pwd
		we = driver.findElement(confirmPwdField);
		we.clear();
		we.sendKeys(pwd);
		Helper.waiting(1000);
		
		// submit form
		we = driver.findElement(submitBtn);
		we.click();
		
		try {
			if(driver.findElements(confirmRegistrationMsg).size() !=0) {
				System.out.println("===============debug1===============");
				we = driver.findElement(confirmRegistrationMsg);
				registrutionStatus = we.getText();
			}
		} catch (NoSuchElementException e) {
			System.out.println("registaratio fail");
			System.out.println("===============debug2===============");
		}
		
		
		Helper.waiting(2000);

		return registrutionStatus;
		
	}
}
