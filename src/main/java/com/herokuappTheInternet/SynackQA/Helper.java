/**
 *   File Name: Helper.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 17, 2018
 *   
 */

package com.herokuappTheInternet.SynackQA;

public class Helper {
		
	static void waiting(int time) {
		try {
			Thread.sleep(time);
			} catch(InterruptedException e) {e.printStackTrace();
			}
		}
	
}
