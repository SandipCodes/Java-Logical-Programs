package com.app.logical.programs;

import java.util.Arrays;

public class AnagramTest {

	static int jj = 0;
	static int ii = 0;

	public static void main(String[] args) {

		 //checkAnagramStrings1();
		// checkAnagramStrings2();
		
		//checkAnagramStrings3();

		checkAnagramStringsOptimized();
	}// main

	public static void checkAnagramStringsOptimized() {
		
		System.out.println("AnagramTest.checkAnagramStringsOptimized()");
		/*String s1="keep";
		String s2="peek";
		*/
		String s1="silent1";
		String s2="listen";
		
		
		/*String s1="sound";
		String s2="wound";*/
		
		boolean flag=true;
		
		int len1=s1.length();
		int len2=s2.length();
		
		if(len1 !=len2) {
			System.out.println("given Strings are not anagrams.");
			  // flag=false;
			  System.exit(0);
		}//if
		int found=0;
		int i=0;
		for( i=0;i<len1;i++) {
			    
			 ii++;
			
			for(int j=0;j<len2;j++) {
				
				jj++;
				
				if(s1.charAt(i) == s2.charAt(j)) {
					found=1;
					break;
				}//if
				
			}//inner for
			
			if(found !=1) {
				flag=false;
				break;
			}
			
		}//outer for
		
		/*if(len1 == i) {
			System.out.println(s1+ "  &  "+ s2+ " Strings are anagrams.");
		}
		else {
			System.out.println(s1+ "  &  "+ s2+ " Strings arenot anagrams.");
		}*/
		

		if(flag) {
			System.out.println(s1+ "  &  "+ s2+ " Strings are anagrams.");
		}
		else {
			System.out.println(s1+ "  &  "+ s2+ " Strings arenot anagrams.");
		}
		System.out.println("Outer loop executes for:" + ii + " times");
		System.out.println("Inner loop executes for:" + jj + " times");
	}

	public static void checkAnagramStrings1() {

		/*
		 * String s1="keep"; String s2="peek";
		 */
/*		String s1 = "silent";
		String s2 = "listen";
*/
		
		  String s1="sound"; 
		  String s2="wound";
		 

		int matchedCharCount = 0;
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 != len2) {
			System.out.println("given Strings are not anagrams.");
			System.exit(0);
		} // if

		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {

				jj++;

				if (s1.charAt(i) == s2.charAt(j)) {
					matchedCharCount++;
					break;

				} // if

			} // inner for
			ii++;
		} // outer for

		if (len1 != matchedCharCount) {
			System.out.println(s1 + "  &  " + s2 + " Strings arenot anagrams.");
		} else {
			System.out.println(s1 + "  &  " + s2 + " Strings are anagrams.");
		}

		System.out.println("Outer loop executes for:" + ii + " times");
		System.out.println("Inner loop executes for:" + jj + " times");
	}// checkAnagramStrings()

	public static void checkAnagramStrings2() {

		String s1 = "keep";
		String s2 = "peek";

		/*
		 * String s1="silent"; String s2="listen";
		 */

		/*
		 * String s1="sound"; String s2="wound";
		 */

		int matchedCharCount = 0;
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 != len2) {
			System.out.println("given Strings are not anagrams.");
			System.exit(0);
		} // if

		for (int i = 0; i < len1; i++) {

			char ch = s1.charAt(i);

			if (s2.indexOf(ch) != -1) {
				matchedCharCount++;
			} // if
		} // for

		if (len1 != matchedCharCount) {
			System.out.println(s1 + "  &  " + s2 + " Strings arenot anagrams.");
		} else {
			System.out.println(s1 + "  &  " + s2 + " Strings are anagrams.");
		}

	}// checkAnagramStrings2()

	public static void checkAnagramStrings3() {

		/*
		 * String s1="keep"; String s2="peek";
		 */
		/*
		 * String s1="silent"; String s2="listen";
		 */

		String s1 = "sound";
		String s2 = "wound";

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 != len2) {
			System.out.println("given Strings are not anagrams.");
			System.exit(0);
		} // if

		// convert given strings to array
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		// sort given strings in ascending order
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// compare both strings
		boolean flag = Arrays.equals(ch1, ch2);

		if (flag) {
			System.out.println(s1 + " & " + s2 + " are anagrams..");
		} else {
			System.out.println(s1 + " & " + s2 + " arenot anagrams..");
		}

	}// checkAnagramStrings3()

}// class
