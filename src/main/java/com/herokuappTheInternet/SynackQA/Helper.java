/**
 *   File Name: Helper.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 17, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

import java.util.Random;

/**
 * Helper //ADDD (description of class)
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
public class Helper {
	
	static Random rand;
	
	static void waiting(int time) {try {Thread.sleep(time);} catch(InterruptedException e) {e.printStackTrace();}}
	
	public static String generateUserName() {
		rand = new Random();
		int num1 = rand.nextInt(99999) + 1000;
		int num2 = rand.nextInt(99999) + 1000;
		return "user" + num1 + "me" + num2;
	}
	
	public static String generateEmail() {
		rand = new Random();
		int num1 = rand.nextInt(99999) + 1000;
		int num2 = rand.nextInt(99999) + 1000;
		return "user." + num1 + ".me." + num2 + "@mail.com";
	}
	
}
