package com.app.logical.programs;

import java.util.Scanner;

public class ReplaceCharWithOccurence {

	// private static char count=0;

	public static void main(String[] args) {

		//replaceCharWithOccurence1();
		replaceCharWithOccurence2();
	}// main()

	public static void replaceCharWithOccurence1() {

		String str = new String("OPENktktttttt");
		char charToReplaceUpper = 'z';
		char charToReplaceLower='z';
		int len = str.length();
		int count = 0;

		String newString = "";

		if (str.indexOf(charToReplaceLower) == -1 && str.indexOf(charToReplaceUpper) == -1) {

			System.out.println("Character not present in string..");
			System.exit(0);
		}

		
		for (int i = 0; i < len; i++) {

			if (str.charAt(i) == charToReplaceUpper || str.charAt(i) == charToReplaceLower) {
				newString += (++count);
			} // if
			else {
				newString += str.charAt(i);
			} // else

		} // for

		System.out.println(newString);

	}// method1

	public static void replaceCharWithOccurence2() {

		String str = new String("OPTENtktttttt");
		
		char charToReplaceUpper ='T';
		char charToReplaceLower='t';
		
		int len = str.length();
		int count = 0;
		
		if (str.indexOf(charToReplaceLower) == -1 && str.indexOf(charToReplaceUpper) == -1) {

			System.out.println("Character not present in string..");
			System.exit(0);
		}

		
		for (int i = 0; i < len; i++) { 

			if (str.charAt(i) == charToReplaceLower) {

				str=str.replaceFirst(String.valueOf(charToReplaceLower), String.valueOf(++count));
				
		   }
			else if(str.charAt(i) == charToReplaceUpper) {
				str=str.replaceFirst(String.valueOf(charToReplaceUpper), String.valueOf(++count));
		
			}
			else {
				
			}
	
		}//for

		System.out.println(str);
	}// method

}// class
