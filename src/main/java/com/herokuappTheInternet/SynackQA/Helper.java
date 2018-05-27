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
	
	public static int countryNameToDropDownNumber(String countryName) {
		int countryNumber = 0;
		
		switch(countryName) {
		
			case "Afhanistan" : countryNumber = 1;
			break;
			case "Albania" : countryNumber = 2;
			break;
			case "Algeria" : countryNumber = 3;
			break;
			case "American Samoa" : countryNumber = 4;
			break;
			case "Andorra" : countryNumber = 5;
			break;
			case "Angola" : countryNumber = 6;
			break;
			case "Antigua and Barbuda" : countryNumber = 7;
			break;
			case "Argentina" : countryNumber = 8;
			break;
			case "Armenia" : countryNumber = 9;
			break;
			case "Australia" : countryNumber = 10;
			break;
			case "Austria" : countryNumber = 11;
			break;
			case "Azerbaijan" : countryNumber = 12;
			break;
			case "Bahamas" : countryNumber = 13;
			break;
			case "Bahrain" : countryNumber = 14;
			break;
			case "Bangladesh" : countryNumber = 15;
			break;
			case "Barbados" : countryNumber = 16;
			break;
			case "Belarus" : countryNumber = 17;
			break;
			case "Belgium" : countryNumber = 18;
			break;
			case "Belize" : countryNumber = 19;
			break;
			case "Benin" : countryNumber = 20;
			break;
			case "Bermuda" : countryNumber = 21;
			break;
			case "Bhutan" : countryNumber = 22;
			break;
			case "Bolivia" : countryNumber = 23;
			break;
			case "Bosnia and Herzegovina" : countryNumber = 24;
			break;
			case "Botswana" : countryNumber = 25;
			break;
			case "Brazil" : countryNumber = 26;
			break;
			case "Brunei" : countryNumber = 27;
			break;
			case "Bulgaria" : countryNumber = 28;
			break;
			case "Burkina Faso" : countryNumber = 29;
			break;
			case "Burundi" : countryNumber = 30;
			break;
			case "Cambodia" : countryNumber = 31;
			break;
			case "Cameroon" : countryNumber = 32;
			break;
			case "Canada" : countryNumber = 33;
			break;
			case "Cape Verde" : countryNumber = 34;
			break;
			case "Central African Republic" : countryNumber = 35;
			break;
			case "Chad" : countryNumber = 36;
			break;
			case "Chile" : countryNumber = 37;
			break;
			case "China" : countryNumber = 38;
			break;
			case "Colombia" : countryNumber = 39;
			break;
			case "Comoros" : countryNumber = 40;
			break;
			case "Congo" : countryNumber = 41;
			break;
			case "Costa Rica" : countryNumber = 42;
			break;
			case "Côte d'Ivoire" : countryNumber = 43;
			break;
			case "Croatia" : countryNumber = 44;
			break;
			case "Cuba" : countryNumber = 45;
			break;
			case "Cyprus" : countryNumber = 46;
			break;
			case "Czech Republic" : countryNumber = 47;
			break;
			case "Denmark" : countryNumber = 48;
			break;
			case "Djibouti" : countryNumber = 49;
			break;
			case "Dominica" : countryNumber = 50;
			break;
			case "Dominican Republic" : countryNumber = 51;
			break;
			case "East Timor" : countryNumber = 52;
			break;
			case "Ecuador" : countryNumber = 53;
			break;
			case "Egypt" : countryNumber = 54;
			break;
			case "El Salvador" : countryNumber = 55;
			break;
			case "Equatorial Guinea" : countryNumber = 56;
			break;
			case "Eritrea" : countryNumber = 57;
			break;
			case "Estonia" : countryNumber = 58;
			break;
			case "Ethiopia" : countryNumber = 59;
			break;
			case "Fiji" : countryNumber = 60;
			break;
			case "Finland" : countryNumber = 61;
			break;
			case "France" : countryNumber = 62;
			break;
			case "Gabon" : countryNumber = 63;
			break;
			case "Gambia" : countryNumber = 64;
			break;
			case "Georgia" : countryNumber = 65;
			break;
			case "Germany" : countryNumber = 66;
			break;
			case "Ghana" : countryNumber = 67;
			break;
			case "Greece" : countryNumber = 68;
			break;
			case "Greenland" : countryNumber = 69;
			break;
			case "Grenada" : countryNumber = 70;
			break;
			case "Guam" : countryNumber = 71;
			break;
			case "Guatemala" : countryNumber = 72;
			break;
			case "Guinea" : countryNumber = 73;
			break;
			case "Guinea-Bissau" : countryNumber = 74;
			break;
			case "Guyana" : countryNumber = 75;
			break;
			case "Haiti" : countryNumber = 76;
			break;
			case "Honduras" : countryNumber = 77;
			break;
			case "Hong Kong" : countryNumber = 78;
			break;
			case "Hungary" : countryNumber = 79;
			break;
			case "Iceland" : countryNumber = 80;
			break;
			case "India" : countryNumber = 81;
			break;
			case "Indonesia" : countryNumber = 82;
			break;
			case "Iran" : countryNumber = 83;
			break;
			case "Iraq" : countryNumber = 84;
			break;
			case "Ireland" : countryNumber = 85;
			break;
			case "Israel" : countryNumber = 86;
			break;
			case "Italy" : countryNumber = 87;
			break;
			case "Jamaica" : countryNumber = 88;
			break;
			case "Japan" : countryNumber = 89;
			break;
			case "Jordan" : countryNumber = 90;
			break;
			case "Kazakhstan" : countryNumber = 91;
			break;
			case "Kenya" : countryNumber = 92;
			break;
			case "Kiribati" : countryNumber = 93;
			break;
			case "North Korea" : countryNumber = 94;
			break;
			case "South Korea" : countryNumber = 95;
			break;
			case "Kuwait" : countryNumber = 96;
			break;
			case "Kyrgyzstan" : countryNumber = 97;
			break;
			case "Laos" : countryNumber = 98;
			break;
			case "Latvia" : countryNumber = 99;
			break;
			case "Lebanon" : countryNumber = 100;
			break;
			case "Lesotho" : countryNumber = 101;
			break;
			case "Liberia" : countryNumber = 102;
			break;
			case "Libya" : countryNumber = 103;
			break;
			case "Liechtenstein" : countryNumber = 104;
			break;
			case "Lithuania" : countryNumber = 105;
			break;
			case "Luxembourg" : countryNumber = 106;
			break;
			case "Macedonia" : countryNumber = 107;
			break;
			case "Madagascar" : countryNumber = 108;
			break;
			case "Malawi" : countryNumber = 109;
			break;
			case "Malaysia" : countryNumber = 110;
			break;
			case "Maldives" : countryNumber = 111;
			break;
			case "Mali" : countryNumber = 112;
			break;
			case "Malta" : countryNumber = 113;
			break;
			case "Marshall Islands" : countryNumber = 114;
			break;
			case "Mauritania" : countryNumber = 115;
			break;
			case "Mauritius" : countryNumber = 116;
			break;
			case "Mexico" : countryNumber = 117;
			break;
			case "Micronesia" : countryNumber = 118;
			break;
			case "Moldova" : countryNumber = 119;
			break;
			case "Monaco" : countryNumber = 120;
			break;
			case "Mongolia" : countryNumber = 121;
			break;
			case "Montenegro" : countryNumber = 122;
			break;
			case "Morocco" : countryNumber = 123;
			break;
			case "Mozambique" : countryNumber = 124;
			break;
			case "Myanmar" : countryNumber = 125;
			break;
			case "Namibia" : countryNumber = 126;
			break;
			case "Nauru" : countryNumber = 127;
			break;
			case "Nepal" : countryNumber = 128;
			break;
			case "Netherlands" : countryNumber = 129;
			break;
			case "New Zealand" : countryNumber = 130;
			break;
			case "Nicaragua" : countryNumber = 131;
			break;
			case "Niger" : countryNumber = 132;
			break;
			case "Nigeria" : countryNumber = 133;
			break;
			case "Norway" : countryNumber = 134;
			break;
			case "Northern Mariana Islands" : countryNumber = 135;
			break;
			case "Oman" : countryNumber = 136;
			break;
			case "Pakistan" : countryNumber = 137;
			break;
			case "Palau" : countryNumber = 138;
			break;
			case "Palestine" : countryNumber = 139;
			break;
			case "Panama" : countryNumber = 140;
			break;
			case "Papua New Guinea" : countryNumber = 141;
			break;
			case "Paraguay" : countryNumber = 142;
			break;
			case "Peru" : countryNumber = 143;
			break;
			case "Philippines" : countryNumber = 144;
			break;
			case "Poland" : countryNumber = 145;
			break;
			case "Portugal" : countryNumber = 146;
			break;
			case "Puerto Rico" : countryNumber = 147;
			break;
			case "Qatar" : countryNumber = 148;
			break;
			case "Romania" : countryNumber = 149;
			break;
			case "Russia" : countryNumber = 150;
			break;
			case "Rwanda" : countryNumber = 151;
			break;
			case "Saint Kitts and Nevis" : countryNumber = 152;
			break;
			case "Saint Lucia" : countryNumber = 153;
			break;
			case "Saint Vincent and the Grenadines" : countryNumber = 154;
			break;
			case "Samoa" : countryNumber = 155;
			break;
			case "San Marino" : countryNumber = 156;
			break;
			case "Sao Tome and Principe" : countryNumber = 157;
			break;
			case "Saudi Arabia" : countryNumber = 158;
			break;
			case "Senegal" : countryNumber = 159;
			break;
			case "Serbia and Montenegro" : countryNumber = 160;
			break;
			case "Seychelles" : countryNumber = 161;
			break;
			case "Sierra Leone" : countryNumber = 162;
			break;
			case "Singapore" : countryNumber = 163;
			break;
			case "Slovakia" : countryNumber = 164;
			break;
			case "Slovenia" : countryNumber = 165;
			break;
			case "Solomon Islands" : countryNumber = 166;
			break;
			case "Somalia" : countryNumber = 167;
			break;
			case "South Africa" : countryNumber = 168;
			break;
			case "Spain" : countryNumber = 169;
			break;
			case "Sri Lanka" : countryNumber = 170;
			break;
			case "Sudan" : countryNumber = 171;
			break;
			case "Sudan, South" : countryNumber = 172;
			break;
			case "Suriname" : countryNumber = 173;
			break;
			case "Swaziland" : countryNumber = 174;
			break;
			case "Sweden" : countryNumber = 175;
			break;
			case "Switzerland" : countryNumber = 176;
			break;
			case "Syria" : countryNumber = 177;
			break;
			case "Taiwan" : countryNumber = 178;
			break;
			case "Tajikistan" : countryNumber = 179;
			break;
			case "Tanzania" : countryNumber = 180;
			break;
			case "Thailand" : countryNumber = 181;
			break;
			case "Togo" : countryNumber = 182;
			break;
			case "Tonga" : countryNumber = 183;
			break;
			case "Trinidad and Tobago" : countryNumber = 184;
			break;
			case "Tunisia" : countryNumber = 185;
			break;
			case "Turkey" : countryNumber = 186;
			break;
			case "Turkmenistan" : countryNumber = 186;
			break;
			case "Tuvalu" : countryNumber = 187;
			break;
			case "Uganda" : countryNumber = 188;
			break;
			case "Ukraine" : countryNumber = 189;
			break;
			case "United Arab Emirates" : countryNumber = 190;
			break;
			case "United Kingdom" : countryNumber = 191;
			break;
			case "United States" : countryNumber = 192;
			break;
			case "Uruguay" : countryNumber = 193;
			break;
			case "Uzbekistan" : countryNumber = 194;
			break;
			case "Vanuatu" : countryNumber = 195;
			break;
			case "Vatican City" : countryNumber = 196;
			break;
			case "Venezuela" : countryNumber = 197;
			break;
			case "Vietnam" : countryNumber = 198;
			break;
			case "Virgin Islands, British" : countryNumber = 199;
			break;
			case "Virgin Islands, U.S." : countryNumber = 200;
			break;
			case "Yemen" : countryNumber = 201;
			break;
			case "Zambia" : countryNumber = 202;
			break;
			case "Zimbabwe" : countryNumber = 203;
			break;
	
		}
		
		return countryNumber;
	}
	
	public static int yearToDropDownNumber(int year) {
		/*		
		2014: 2
		2013: 3
		..
		
		1950:
		*/	
		int yearNumber = 2;
		switch(year) {
			case 2014 : yearNumber = 2;
			break;
			
			case 2013 : yearNumber = 3;
			break;
			
			case 2012 : yearNumber = 4;
			break;
			
			case 2011 : yearNumber = 5;
			break;
			
			case 2010 : yearNumber = 6;
			break;
			
			case 2009 : yearNumber = 7;
			break;
			
			case 2008 : yearNumber = 8;
			break;
			
			case 2007 : yearNumber = 9;
			break;
			
			case 2006 : yearNumber = 10;
			break;
			
			case 2005 : yearNumber = 11;
			break;
			
			case 2004 : yearNumber = 12;
			break;
			
			case 2003 : yearNumber = 13;
			break;
			
			case 2002 : yearNumber = 14;
			break;
			
			case 2001 : yearNumber = 15;
			break;
			
			case 2000 : yearNumber = 16;
			break;
			
			case 1999 : yearNumber = 17;
			break;
			
			case 1998 : yearNumber = 18;
			break;
			
			case 1997 : yearNumber = 19;
			break;
			
			case 1996 : yearNumber = 20;
			break;
			
			case 1995 : yearNumber = 21;
			break;
			
			case 1994 : yearNumber = 22;
			break;
			
			case 1993 : yearNumber = 23;
			break;
			
			case 1992 : yearNumber = 24;
			break;
			
			case 1991 : yearNumber = 25;
			break;
			
			case 1990 : yearNumber = 26;
			break;
			
			case 1989 : yearNumber = 27;
			break;
			
			case 1988 : yearNumber = 28;
			break;
			
			case 1987 : yearNumber = 29;
			break;
			
			case 1986 : yearNumber = 30;
			break;
			
			case 1985 : yearNumber = 31;
			break;
			
			case 1984 : yearNumber = 32;
			break;
			
			case 1983 : yearNumber = 33;
			break;		
			
			case 1982 : yearNumber = 34;
			break;
			
			case 1981 : yearNumber = 35;
			break;
			
			case 1980 : yearNumber = 36;
			break;
			
			case 1979 : yearNumber = 37;
			break;
			
			case 1978 : yearNumber = 38;
			break;
			
			case 1977 : yearNumber = 39;
			break;
			
			case 1976 : yearNumber = 40;
			break;
			
			case 1975 : yearNumber = 41;
			break;
			
			case 1974 : yearNumber = 42;
			break;
			
			case 1973 : yearNumber = 43;
			break;
			
			case 1972 : yearNumber = 44;
			break;
			
			case 1971 : yearNumber = 45;
			break;
			
			case 1970 : yearNumber = 46;
			break;
			
			case 1969 : yearNumber = 47;
			break;
			
			case 1968 : yearNumber = 48;
			break;
			
			case 1967 : yearNumber = 49;
			break;
			
			case 1966 : yearNumber = 50;
			break;
			
			case 1965 : yearNumber = 51;
			break;
			
			case 1964 : yearNumber = 52;
			break;
			
			case 1963 : yearNumber = 53;
			break;
			
			case 1962 : yearNumber = 54;
			break;
			
			case 1961 : yearNumber = 55;
			break;
			
			case 1960 : yearNumber = 56;
			break;
			
			case 1959 : yearNumber = 57;
			break;
			
			case 1958 : yearNumber = 58;
			break;
			
			case  1957: yearNumber = 59;
			break;
			
			case 1956 : yearNumber = 60;
			break;
			
			case 1955 : yearNumber = 61;
			break;
			
			case 1954 : yearNumber = 62;
			break;
			
			case 1953 : yearNumber = 63;
			break;
			
			case 1952 : yearNumber = 64;
			break;
			
			case 1951 : yearNumber = 65;
			break;
			
			case 1950 : yearNumber = 66;
			break;

		}

		return yearNumber;
	}
	
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
